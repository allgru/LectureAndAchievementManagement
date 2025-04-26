package de.allangrunert.LAM.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture_exam_time")
@Setter
@Getter
@NoArgsConstructor
public class LectureExamTime {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id 
    private int id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String dayOfWeek;
    private Room room;

}
