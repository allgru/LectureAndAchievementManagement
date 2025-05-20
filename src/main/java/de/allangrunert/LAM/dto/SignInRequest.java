package de.allangrunert.lam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @see https://github.com/wazooinc/spring-boot-3-jwt-authentication/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignInRequest {
    String username;
    String password;
}
