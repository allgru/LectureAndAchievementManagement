package de.allangrunert.lam.entities;

import java.util.ArrayList;

import jakarta.persistence.Column;
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
@Table(name = "subscription_rule")
@Setter
@Getter
@NoArgsConstructor
public class SubscriptionRule implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    private String name;
    private String description;
    private String type;
    /* @OneToMany
    private ArrayList<ProgressRuleCriteria> criteria;*/

}
