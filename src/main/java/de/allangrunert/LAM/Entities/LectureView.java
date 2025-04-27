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
@Table(name = "lecture_view")
@Setter
@Getter
@NoArgsConstructor
public class LectureView implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private String name;
    private int position; // sort position
    private ArrayList<Lecture> lectures;

    private boolean isActive = false;
    private boolean isVisible = false;

    @OneToMany
    private ArrayList<LectureViewCriteria> criteriaList;

}
