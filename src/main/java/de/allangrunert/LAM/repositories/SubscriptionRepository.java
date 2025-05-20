package de.allangrunert.lam.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.allangrunert.lam.entities.Subscription;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    
}
    
