package de.allangrunert.lam.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Setter
@Getter
@NoArgsConstructor
public class Student implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String phoneNumber2;
    private String phoneNumber3;
    private String address;
    private String postalCode;
    private String city;
    private String country;
    private String titleFront;
    private String titleBack;
    private String birthName;
    private LocalDateTime birthDate;
    private String birthPlace;
    private String birthCountry;
    private String socialMedia;
    // private User user;
    /* @OneToMany
    private ArrayList<StudentProgress> progressList;*/
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
