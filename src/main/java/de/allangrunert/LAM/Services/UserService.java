package de.allangrunert.lam.services;

import java.time.LocalDateTime;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.UserDetailsServiceConfigurer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.allangrunert.lam.entities.User;
import de.allangrunert.lam.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

// @see https://github.com/wazooinc/spring-boot-3-jwt-authenticatio


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {

            @Override
            public UserDetails loadUserByUsername(String username) {
               return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found")); 
            }            
        };
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setUpdatedAt(LocalDateTime.now());
        }

        user.setUpdatedAt(LocalDateTime.now());
        
        return userRepository.save(user);            
    }
    
}
