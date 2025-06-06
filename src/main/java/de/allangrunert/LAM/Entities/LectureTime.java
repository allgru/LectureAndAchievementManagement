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
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lecture_time")
@Setter
@Getter
@NoArgsConstructor
public class LectureTime implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private Long id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String dayOfWeek;
    /*@OneToMany
    private ArrayList<Room> room; // could be more than one room
    @OneToMany
    private ArrayList<AdministrativePerson> supervisor; // from lecture descending supervisors??*/
    
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
