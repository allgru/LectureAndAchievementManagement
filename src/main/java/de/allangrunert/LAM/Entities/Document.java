package de.allangrunert.LAM.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "configuration")
@Setter
@Getter
@NoArgsConstructor

public class Document {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    @Lob
    private byte[] data;
    private DocumentMetaData metaData;
    private String name;
    private String description;

}
