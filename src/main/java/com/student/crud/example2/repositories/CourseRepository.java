package com.student.crud.example2.repositories;

import com.student.crud.example2.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

    Course findByName(String name);
}
