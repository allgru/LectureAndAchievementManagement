package de.allangrunert.lam.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subscription")
@Setter
@Getter
@NoArgsConstructor
public class Subscription implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    /* @ManyToOne
    private Student student;
    @ManyToOne
    private Lecture Lecture;
    @ManyToOne
    private BaseLecture lectureBaseLectureList;
    @OneToMany
    private ArrayList<Grade> gradeHistoryList;
    @OneToMany
    private ArrayList<PartialGrade> partialGradeHistoryList;
    @OneToMany
    private ArrayList<SubscriptionCriteria> subscriptionCriteriaList;
    @OneToOne
    private LectureExamTime lectureExamTimeList;
    */
    private LocalDateTime lectureExamDateTime; // backup for exam time
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;   
    /* 
    @OneToMany
    private ArrayList<Document> documentList;
    @OneToOne
    private Grade grade;
    @OneToMany
    private ArrayList<PartialGrade> partialGradeList;
    */
}
