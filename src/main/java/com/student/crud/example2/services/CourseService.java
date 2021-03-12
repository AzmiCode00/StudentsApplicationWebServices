package com.student.crud.example2.services;

import com.student.crud.example2.models.Course;
import com.student.crud.example2.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;


    public Course saveCourse(Course course){
        return repository.save(course);
    }

    public List<Course> saveCourses(List<Course> courses){
        return repository.saveAll(courses);
    }

    public List<Course> getCourses(){
        return repository.findAll();
    }

    public Course getCourseById(int id){
        return repository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name){
        return repository.findByName(name);
    }

    public String deleteCourse(int id){
        repository.deleteById(id);
        return "course removed!!"+id;
    }

    public Course updateCourse(Course course){
       Course existingCourse=repository.findById(course.getId()).orElse(null);
       existingCourse.setName(course.getName());
       existingCourse.setCourseNo(course.getCourseNo());

        return repository.save(existingCourse);


    }

}
