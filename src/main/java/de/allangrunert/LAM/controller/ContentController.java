package de.allangrunert.lam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.allangrunert.lam.entities.Student;

// TODO: Remove

@RestController
public class ContentController {

    @GetMapping("/")
    public Student test() {
        return new Student();
    }

}
