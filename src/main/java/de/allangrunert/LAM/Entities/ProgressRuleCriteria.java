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
import java.io.Serializable;

@Entity
@Table(name = "progress_rule_criteria")
@Setter
@Getter
@NoArgsConstructor
public class ProgressRuleCriteria implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    @OneToMany
    private ArrayList<Criteria> criteria;
    private String value;
 
}
