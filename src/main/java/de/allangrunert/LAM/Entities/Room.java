package de.allangrunert.LAM.Entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "configuration")
@Setter
@Getter
@NoArgsConstructor
public class Room {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private String name;
    private String locationName;
    private String locationBuilding;
    private String address;
    private String addressAddition;
    private String postalCode;    
    private String city;
    private String country;
    private String phoneNumber;
    private ArrayList<AdministrativePerson> responsiblePersonList;

}
