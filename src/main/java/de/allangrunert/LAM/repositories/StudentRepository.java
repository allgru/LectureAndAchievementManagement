package de.allangrunert.lam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import de.allangrunert.lam.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
    
