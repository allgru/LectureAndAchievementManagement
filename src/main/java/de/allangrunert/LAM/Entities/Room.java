package de.allangrunert.lam.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
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
@Table(name = "room")
@Setter
@Getter
@NoArgsConstructor
public class Room implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;
    private String name;
    private String locationName;
    private String locationBuilding;
    private String address;
    private String addressAddition;
    private String postalCode;    
    private String city;
    private String country;
    private String phoneNumber;
    /* @OneToMany
    private ArrayList<AdministrativePerson> responsiblePersonList;*/

}
