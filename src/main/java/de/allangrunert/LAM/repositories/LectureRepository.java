package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.allangrunert.lam.entities.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
    
}
    
