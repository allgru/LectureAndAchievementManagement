package de.allangrunert.LAM.Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture_time")
@Setter
@Getter
@NoArgsConstructor
public class LectureTime {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String dayOfWeek;
    private ArrayList<Room> room; // could be more than one room
    private ArrayList<AdministrativePerson> supervisor; // from lecture descending supervisors??
    
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
