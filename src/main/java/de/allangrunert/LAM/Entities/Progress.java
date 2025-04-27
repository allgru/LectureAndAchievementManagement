package de.allangrunert.lam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Entity
@Table(name = "progress")
@Setter
@Getter
@NoArgsConstructor
public class Progress implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    private String name;
    private String description;

  
}
