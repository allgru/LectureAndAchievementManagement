package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.allangrunert.lam.entities.Lecture;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
    
}
    
