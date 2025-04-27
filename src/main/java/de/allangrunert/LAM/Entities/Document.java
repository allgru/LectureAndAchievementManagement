package de.allangrunert.lam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "document")
@Setter
@Getter
@NoArgsConstructor

public class Document implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    @Lob
    private byte[] data;

    private String name;
    private String description;
    
    @OneToOne
    private DocumentMetadata metaData;


}
