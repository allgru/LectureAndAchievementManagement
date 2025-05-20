package de.allangrunert.lam.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// @see https://github.com/wazooinc/spring-boot-3-jwt-authentication/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
}
