package de.allangrunert.lam.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lecture")
@Getter
@Setter
@NoArgsConstructor
public class Lecture implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String title;
    private String subTitle;
    private String description;

    private BaseLecture baseLecture;
    @OneToMany
    private ArrayList<LectureCriteria> criteriaList;
    @OneToMany
    private ArrayList<Subscription> subscriptionList;
    @ManyToMany
    private ArrayList<LectureView> lectureViewList;

    @ManyToMany
    private ArrayList<AdministrativePerson> lecturerList;
    @ManyToMany
    private ArrayList<AdministrativePerson> clerkList; // TODO: Clerklist? Better name?
    @ManyToMany
    private ArrayList<AdministrativePerson> examinerList;
    private ArrayList<LectureTime> lectureTimeList;
    private ArrayList<LectureExamTime> exameTimeList;    
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean isActive = false;
    private boolean isVisible = false;

    
}
