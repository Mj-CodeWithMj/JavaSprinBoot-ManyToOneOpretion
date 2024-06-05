package com.example.student.studentopretion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.studentopretion.model.Student;
import com.example.student.studentopretion.service.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("/saveStudent")
	public Student svaeStudent(@RequestBody Student student) {
		Student students = studentServices.saveStudents(student);
		return students;
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		List<Student> student = studentServices.getStudent();
		return student;
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable Long id,@RequestBody Student student) {
		Student students = studentServices.updateStudent(id, student);
		return students;
	}
	
	@DeleteMapping("/deleteStudents/{id}")
	public void deleteStudents(@PathVariable Long id) {
		studentServices.deleteStudent(id);
	}
	
	@GetMapping("/getStudentByname/{name}")
	public Student getStudentByName(@PathVariable String name) {
		Student student = studentServices.getStudentByName(name);
		return student;
	}

	@GetMapping("/getStudentByemail/{email}")
	public Student getStudentByEmail(@PathVariable String email) {
		Student student = studentServices.getStudentByEmail(email);
		return student;
	}
	
	@GetMapping("/getStudentByEnrollementNumber/{enrollmentNo}")
	public Student getStudentByEnrollementNumber(@PathVariable String enrollmentNo) {
		Student student = studentServices.getStudentByEnorollmentNumber(enrollmentNo);
		return student;
	}
	
	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getStudentByEnrollementNumber(@PathVariable Long id) {
		Optional<Student> student = studentServices.getstudentById(id);
		return student;
	}
	
	
	
	
	
	
}
