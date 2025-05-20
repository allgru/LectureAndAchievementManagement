package de.allangrunert.lam.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_progress_log")
@Setter
@Getter
@NoArgsConstructor
public class StudentProgressLog implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    /* @ManyToOne
    private Student student;
    private Progress progress;*/
    private String date;
    /* @OneToOne
    private Criteria criteria;*/
    private String value;
    private String description;

}
