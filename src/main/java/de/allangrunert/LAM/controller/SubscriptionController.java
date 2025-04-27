package de.allangrunert.lam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allangrunert.lam.entities.Subscription;

@RestController
@RequestMapping("/api/v1/subscription")
public class SubscriptionController {
    
    List<Subscription> getStudentSubscriptions(int studentId)
    {
        // TODO Auto-generated method stub
        return null;
    }

    void subscribeToLecture(int studentId, int lectureId) {
        // TODO Auto-generated method stub
        
    }

}
