package com.example.student.studentopretion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.studentopretion.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	Course findCourseBycourseName(String courseName);

}
