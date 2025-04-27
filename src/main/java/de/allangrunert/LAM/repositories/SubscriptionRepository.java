package de.allangrunert.lam.repositories;

import java.util.concurrent.Flow.Subscription;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    
}
    
