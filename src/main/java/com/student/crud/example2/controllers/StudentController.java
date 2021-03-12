package com.student.crud.example2.controllers;

import com.student.crud.example2.models.Student;
import com.student.crud.example2.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;


    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PostMapping("/students/bulk")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @GetMapping("/students/name/{name}")
    public Student findStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    @GetMapping("/students/count")
    public int countStudents(){
        return service.getNumberOfStudents();
    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteStudent(id);
    }



}
