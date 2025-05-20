package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.allangrunert.lam.entities.BaseLecture;

@Repository
public interface BaseLectureRepository extends JpaRepository<BaseLecture, Long> {
    
}
    
