package com.example.demo2.Repositories;

import com.example.demo2.Entities.FacultyEntity;
import com.example.demo2.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FacultyRepository extends JpaRepository<FacultyEntity, Long> {
}