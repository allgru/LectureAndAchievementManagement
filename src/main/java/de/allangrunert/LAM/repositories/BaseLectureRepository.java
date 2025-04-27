package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.allangrunert.lam.entities.BaseLecture;

public interface BaseLectureRepository extends JpaRepository<BaseLecture, Long> {
    
}
    
