package com.example.student.studentopretion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.student.studentopretion.model.Course;
import com.example.student.studentopretion.model.Student;
import com.example.student.studentopretion.repository.CourseRepository;

@Service
public class CourseServices {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses() {
		List<Course> course = courseRepository.findAll();
		return course;
	}
	
	public Course saveCourse(@RequestBody Course course) {
		Course courses = courseRepository.save(course);
		return courses;
	}
	
	public Course updateCourse(@PathVariable Long id,@RequestBody Course course) {
		course.setId(id);
		return courseRepository.save(course);
	}
	public void deleteCourse(@PathVariable Long id) {
		courseRepository.deleteById(id);
	}
// extra servicess 
	
	public Course getCourseByCourseName(@PathVariable String courseName) {
		Course course = courseRepository.findCourseBycourseName(courseName);
		return course;
	}
	public Optional<Course> getcourseById(@PathVariable Long id) {
		Optional<Course> course = courseRepository.findById(id);
		return course;
	}
	
}
