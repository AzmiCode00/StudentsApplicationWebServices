package com.student.crud.example2.repositories;

import com.student.crud.example2.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Integer> {

    Student findByName(String name);
}
