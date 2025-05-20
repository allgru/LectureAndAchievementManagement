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

@Entity
@Table(name = "subscription_criteria")
@Setter
@Getter
@NoArgsConstructor
public class SubscriptionCriteria implements java.io.Serializable { 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    /* @OneToOne
    private Criteria criteria;*/
    private String value;   
    private String description; 
 
}
