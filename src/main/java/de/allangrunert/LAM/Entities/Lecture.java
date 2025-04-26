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
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lecture")
@Getter
@Setter
@NoArgsConstructor
public class Lecture {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String title;
    private String subTitle;
    private String description;

    private LectureBaseLecture baseLecture;
    private ArrayList<LectureCriteria> criteriaList;
    private ArrayList<Subscription> subscriptionList;
    private ArrayList<LectureView> lectureViewList;
    private ArrayList<AdministrativePerson> lecturerList;
    private ArrayList<AdministrativePerson> clerkList;
    private ArrayList<AdministrativePerson> examinerList;
    private ArrayList<LectureTime> lectureTimeList;
    private ArrayList<LectureExamTime> exameTimeList;    
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean isActive = false;
    private boolean isVisible = false;

    
}
