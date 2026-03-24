package com.example.Learn.lombook;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/daneshjoo")
public class StudentController {

    @GetMapping
    public String getStudents() {
        return "List of students";
    }


    @GetMapping("/{name}")
    public Student getStudent(@PathVariable String name){
        return new Student(name,20);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return student;
    }
}