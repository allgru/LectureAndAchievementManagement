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
@Table(name = "configuration")
@Setter
@Getter
@NoArgsConstructor
public class SubscriptionLog {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;
    private Student student;
    private Lecture Lecture;
    private LectureBaseLecture lectureBaseLectureList;
    private ArrayList<Grade> gradeHistoryList;
    private ArrayList<PartialGrade> partialGradeHistoryList;
    private ArrayList<SubscriptionCriteria> subscriptionCriteriaList;
    private LectureExamTime lectureExamTimeList;
    private LocalDateTime lectureExamDateTime; // backup for exam time
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;   
    private ArrayList<Document> documentList;
    private Grade grade;
    private ArrayList<PartialGrade> partialGradeList;

}
