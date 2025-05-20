package de.allangrunert.lam.entities;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;  
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "users")
public class User implements UserDetails{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    @Column(nullable = false)
    Long id;

    @Column(unique = true)
    private String username;

    private String firstName;
    private String lastName;

    private Date birthDate;
    private String birthPlace;
    private String birthCountry;
    
    private String email;
    private String password;
    private String JWTToken;
    private String twoFactor;
    private String status;

    private int loginAttempt;
    private LocalDateTime lastLogin;

    // TODO: more than one role
    Role role;
    
    // Set<Role> roles;

    // @OneToMany
    // private ArrayList<Group> groupList;
    
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;   
    
     @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /*List <GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles)
        {
            authorities.add(new SimpleGrantedAuthority(role.name()));
        }
        return authorities;*/
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
        return List.of(new SimpleGrantedAuthority(role.name()));
    }
    @Override
    public String getUsername() {
        return username;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isAccountNonExpired'");
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isAccountNonLocked'");
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isCredentialsNonExpired'");
    }

    @Override
    public boolean isEnabled() {
        return true;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }
}
