package de.allangrunert.lam.entities;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class User implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private String name;
    private String email;
    private String password;
    private String JWTToken;
    private String twoFactor;
    private String status;
    private boolean isActive;
    private int loginAttempt;
    private LocalDateTime lastLogin;
    @OneToMany
    private ArrayList<Group> groupList;
    @OneToMany
    private ArrayList<Role> roleList;
}
