package de.allangrunert.lam.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Entity
@Table(name = "student_progress_criteria")
@Setter
@Getter
@NoArgsConstructor
public class StudentProgressCriteria implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    @Column(nullable = false)
    private Long id;
    // @OneToOne
    // private Criteria criteria;
    private String value;
    private String description;
}
