package de.allangrunert.lam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// @see https://github.com/wazooinc/spring-boot-3-jwt-authenticatio


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationResponse {
    String token;
}
