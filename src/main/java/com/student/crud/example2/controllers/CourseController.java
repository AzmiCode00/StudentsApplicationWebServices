package com.student.crud.example2.controllers;

import com.student.crud.example2.models.Course;
import com.student.crud.example2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService service;






    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @PostMapping("/courses/bulk")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return service.saveCourses(courses);
    }

    @GetMapping("/courses")
    public List<Course> findAllCourses() {
        return service.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course findCourseById(@PathVariable int id) {
        return service.getCourseById(id);
    }

    @GetMapping("/courses/name/{name}")
    public Course findCourseByName(@PathVariable String name) {
        return service.getCourseByName(name);
    }

    @PutMapping("/courses")
    public Course updateStudent(@RequestBody Course student) {
        return service.updateCourse(student);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteCourse(id);
    }

}
