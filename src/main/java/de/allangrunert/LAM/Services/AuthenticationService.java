package de.allangrunert.lam.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.webauthn.api.AuthenticatorAssertionResponse;
import org.springframework.stereotype.Service;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.lang.IllegalArgumentException;

import de.allangrunert.lam.dto.JwtAuthenticationResponse;
import de.allangrunert.lam.dto.SignUpRequest;
import de.allangrunert.lam.dto.SignInRequest;
import de.allangrunert.lam.entities.Role;
import de.allangrunert.lam.entities.User;
import de.allangrunert.lam.repositories.UserRepository;
import de.allangrunert.lam.services.UserService;

import lombok.RequiredArgsConstructor;

// @see https://github.com/wazooinc/spring-boot-3-jwt-authenticatio

@Service
@RequiredArgsConstructor
public class AuthenticationService {

        private final UserRepository userRepository;
        private final JwtService jwtService;
        private final UserService userService;
        private final AuthenticationManager authenticationManager; 
        private final PasswordEncoder passwordEncoder;

        /**
         * 
         * @param request
         * @return
         */
        public JwtAuthenticationResponse signup(SignUpRequest request) {
                var user = User
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ROLE_STUDENT)
                .build();
                
                user = userService.save(user);
                var jwt = jwtService.generateToken(user);
                return JwtAuthenticationResponse.builder().token(jwt).build();
        }

        /**
         * 
         * @param request
         * @return
         */
        public JwtAuthenticationResponse signin(SignInRequest request) {
                System.out.println("Authenticating user: " + request.getUsername());
                System.out.println("Authenticating pwd: " + request.getPassword());
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
                var user = userRepository
                .findByUsername(request.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("User not found."));
                var jwt = jwtService.generateToken(user);
                System.out.println("Generated JWT: " + jwt);
                return JwtAuthenticationResponse.builder().token(jwt).build();
        }   



}
