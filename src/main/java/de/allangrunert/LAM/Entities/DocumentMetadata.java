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
@Table(name = "document_metadata")
@Setter
@Getter
@NoArgsConstructor
public class DocumentMetadata implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private String name;
    private String description;
    private String value;
}
