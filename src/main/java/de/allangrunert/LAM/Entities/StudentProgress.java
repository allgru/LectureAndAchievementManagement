package de.allangrunert.lam.entities;

import java.util.ArrayList;

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
@Table(name = "student_progress")
@Setter
@Getter
@NoArgsConstructor
public class StudentProgress implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    private Student student;
    private Progress progress;
    @OneToMany
    private ArrayList<StudentProgressCriteria> criteria;
}
