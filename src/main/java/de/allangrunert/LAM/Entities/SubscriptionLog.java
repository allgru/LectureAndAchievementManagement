package de.allangrunert.lam.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subscription_log")
@Setter
@Getter
@NoArgsConstructor
public class SubscriptionLog implements java.io.Serializable {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    /* @OneToOne
    private Student student;
    @OneToOne
    private Lecture Lecture;
    @OneToOne
    private BaseLecture lectureBaseLectureList;
    // TODO: change
    @OneToMany
    private ArrayList<Grade> gradeHistoryList;
    @OneToMany
    private ArrayList<PartialGrade> partialGradeHistoryList;
    @OneToMany
    private ArrayList<SubscriptionCriteria> subscriptionCriteriaList;
    private LectureExamTime lectureExamTimeList;*/
    private LocalDateTime lectureExamDateTime; // backup for exam time
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;   
    /* @OneToMany
    private ArrayList<Document> documentList;
    private Grade grade;
    @OneToMany
    private ArrayList<PartialGrade> partialGradeList;
    */
}
