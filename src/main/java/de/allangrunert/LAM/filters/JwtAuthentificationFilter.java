package de.allangrunert.lam.filters;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import de.allangrunert.lam.services.UserService;
import de.allangrunert.lam.services.JwtService;

// @see https://github.com/wazooinc/spring-boot-3-jwt-authenticatio


@Component
@RequiredArgsConstructor
@Slf4j
public class JwtAuthentificationFilter extends OncePerRequestFilter{
    
    private final JwtService jwtService;
    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, 
                                    FilterChain filterChain    
    ) throws ServletException, IOException
     {
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String username;
        if(StringUtils.isEmpty(authHeader) || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        jwt = authHeader.substring(7);
        log.debug("JWT - {}", jwt.toString());

        username = jwtService.extractUserName(jwt);
        if(StringUtils.isNotEmpty(username)  && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = this.userService.userDetailsService().loadUserByUsername(username);

            if (jwtService.isTokenValid(jwt, userDetails)) {
                log.debug("User - {}", userDetails);
                SecurityContext context = SecurityContextHolder.createEmptyContext();
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                    userDetails, null, userDetails.getAuthorities()
                );
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                context.setAuthentication(authToken);
                SecurityContextHolder.setContext(context);
            }
        }
        filterChain.doFilter(request, response);

    }

}
