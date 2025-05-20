package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.allangrunert.lam.entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
    
