package de.allangrunert.LAM.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture_criteria")
@Setter
@Getter
@NoArgsConstructor
public class LectureCriteria {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private Criteria criteria;
    private String value;
 
}
