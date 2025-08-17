package com.example.demo2.Controllers;

import com.example.demo2.Entities.StudentEntity;
import com.example.demo2.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return repository.save(student);
    }

    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }
}
