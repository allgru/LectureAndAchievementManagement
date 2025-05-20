package de.allangrunert.lam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import de.allangrunert.lam.entities.Criteria;
import de.allangrunert.lam.entities.Subscription;
import de.allangrunert.lam.repositories.SubscriptionRepository;

@Service
public class SubscriptionService {
    
    void subscribeToLecture(int studentId, int lectureId) {
        // TODO Auto-generated method stub
        
    }

    void unsubscribeFromLecture(int studentId, int lectureId) {
        // TODO Auto-generated method stub
        
    }

    List<Subscription> getStudentSubscriptions(int studentId) {
        // TODO Auto-generated method stub
        return null;
        
    }

    void addSubscriptionCriteria(Subscription subscription, Criteria criteria, String value) {
        // TODO Auto-generated method stub
        
    }

    void removeSubscriptionCriteria(Subscription subscription, Criteria criteria) {
        // TODO Auto-generated method stub
    }

    void modifySubscriptionCriteria(Subscription subscription, Criteria criteria, String value) {
        // TODO Auto-generated method stub
    }


    
}
