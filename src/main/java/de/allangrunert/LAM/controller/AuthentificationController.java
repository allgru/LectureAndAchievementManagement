package de.allangrunert.lam.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allangrunert.lam.dto.JwtAuthenticationResponse;
import de.allangrunert.lam.dto.SignInRequest;
import de.allangrunert.lam.dto.SignUpRequest;
import de.allangrunert.lam.services.AuthenticationService;
import de.allangrunert.lam.services.UserService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthentificationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signup(@RequestBody SignUpRequest request) {
        return authenticationService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SignInRequest request) {
        return authenticationService.signin(request);
    }
}   

