package de.allangrunert.lam.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "base_lecture")
@Getter
@Setter
@NoArgsConstructor
public class BaseLecture implements Serializable {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   @Column(nullable = false)
   private Long id;
   private String name;
   
   private LocalDateTime createdAt;
   @UpdateTimestamp
   private LocalDateTime updatedAt;

}
