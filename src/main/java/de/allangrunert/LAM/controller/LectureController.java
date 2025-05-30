package de.allangrunert.lam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allangrunert.lam.entities.Lecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/lecture")
public class LectureController {
    

    @GetMapping("/getStudentLectures/{studentId}")
    public List<Lecture> getLectures(@PathVariable int studentId) 
    {
        Lecture lecture = new Lecture();
        // lecture.setId(1);
        lecture.setName("Lecture 1");
        lecture.setDescription("Description of Lecture 1");
        // lecture.setStartDate("2023-10-01");
        // lecture.setEndDate("2023-10-31");
        // lecture.setCreatedAt("2023-09-01");
        // lecture.setUpdatedAt("2023-09-15");
        // lecture.setCreatedBy("Admin");
        /// lecture.setUpdatedBy("Admin");
               
        return List.of(lecture);
    }

    @PostMapping("/save")
    public String save(@RequestBody Lecture lecture) {
        //TODO: process POST request
        
        return null;
    }

    @GetMapping("/search")
    List<Lecture> searchLectures() {
        // TODO Auto-generated method stub
        return null;
    }

    
    @GetMapping("/{id}") 
    Lecture getLecture(@RequestParam int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
