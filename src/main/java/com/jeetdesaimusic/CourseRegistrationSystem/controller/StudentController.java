package com.jeetdesaimusic.CourseRegistrationSystem.controller;

import com.jeetdesaimusic.CourseRegistrationSystem.DTO.*;
import com.jeetdesaimusic.CourseRegistrationSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/get/{id}")
    public StudentOutDTO getStudent(@PathVariable Integer id)
    {
        return service.getStudent(id);
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable Integer id,@RequestBody StudentDTO studentDTO)
    {
        return service.updateStudent(id,studentDTO);
    }

    @PostMapping("/submit-form/{id}")
    public String submitForm(@PathVariable Integer id, @RequestBody RegistrationFormDTO registrationFormDTO)
    {
        return service.submitForm(id,registrationFormDTO);
    }

    @GetMapping("/get/allcourses")
    public List<CourseForStudentDTO> getAllCourses()
    {
        return service.getAllCourses();
    }

}
