package de.allangrunert.lam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "template")
@Setter
@Getter
@NoArgsConstructor
public class Template implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    private String name;
    private String location;
    private String description;
    private String type;
    private String content; // CLOB better?

}
