package com.example.demo2.Controllers;

import com.example.demo2.Entities.FacultyEntity;
import com.example.demo2.Entities.StudentEntity;
import com.example.demo2.Repositories.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyRepository repository;
    @PostMapping("/add")
    public FacultyEntity addFaculty(@RequestBody FacultyEntity faculty){
        return repository.save(faculty);
    }
    @GetMapping("/show")
    public List<FacultyEntity> showAllFaculties() {

        return repository.findAll();
    }

}
