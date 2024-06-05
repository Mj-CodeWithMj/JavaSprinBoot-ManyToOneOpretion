package com.example.student.studentopretion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.student.studentopretion.model.Student;
import com.example.student.studentopretion.repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudent() {
		List<Student> student = studentRepository.findAll();
		return student;
	}
	

	public Student saveStudents(@RequestBody Student student) {
		Student students = studentRepository.save(student);
		return students;
	}
	
	public Student updateStudent( @PathVariable Long id,@RequestBody Student student) {
		student.setId(id);
		return studentRepository.save(student);
	}
	
	public void deleteStudent(@PathVariable Long id) {
		studentRepository.deleteById(id);
	}
	
// extra servicess 	
	public Optional<Student> getstudentById(@PathVariable Long id) {
		Optional<Student> student = studentRepository.findById(id);
		return student;
	}
	
	public Student getStudentByName(@PathVariable String name) {
		Student student = studentRepository.findStudentByName(name);
		return student;
	}
	
	public Student getStudentByEnorollmentNumber(@PathVariable String enrollmentNo) {
		Student student = studentRepository.findStudentByEnrollmentNo(enrollmentNo);
		return student;
	}
	
	public Student getStudentByEmail(@PathVariable String email) {
		Student student = studentRepository.findStudentByEmail(email);
		return student;
	}

}
