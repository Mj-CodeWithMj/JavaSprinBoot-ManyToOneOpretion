package com.example.student.studentopretion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.student.studentopretion.model.Course;
import com.example.student.studentopretion.model.Student;
import com.example.student.studentopretion.repository.CourseRepository;
import com.example.student.studentopretion.repository.StudentRepository;
import com.example.student.studentopretion.service.CourseServices;
import com.example.student.studentopretion.service.StudentServices;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

@SpringBootTest
class StudentopretionApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	private StudentServices studentServices;
//	
//	@Autowired
//	private StudentRepository studentRepository;
//	
//	@Autowired
//	private CourseRepository courseRepository;
//	
//	@Autowired
//    private CourseServices courseServices;	
//	
//	
////	@Test
////	public void getallstudentstest() {
////		List<Course> excpectedstuentlist = new ArrayList<Course>();
////		Course obj = new Course(1,"Mca");
////		Course obj1 = new Course(2,"Bca");
////		excpectedstuentlist.addAll(excpectedstuentlist);
////		
////		List<Course> actualStudentlist = courseServices.getCourses();
////		
////		assertEquals(excpectedstuentlist, actualStudentlist);
////	
////	}
//	
//	@Test
//	  public void testCreateStudent() {
//	   // Student newStudent = new Student("Murtuza","91","mj91@gmail.com");
//
//	   // studentServices.saveStudents(newStudent);
//
//	   // List<Student> students = studentServices.getStudent();
//	  //  assertEquals(7, students.size());
//	   // assertEquals(newStudent.getName(), students.get(0).getName());
//	  }
//	
//	@Test
//	public void getstudenttest() {
//		
//		 List<Student> students = studentServices.getStudent();
//		    assertEquals(7, students.size());
//	}
//	
	
	@InjectMocks
	private StudentServices studentServices;
	
	@Mock
	private StudentRepository studentRepository;
		
	@Test
	public void getallstudent() {
		Mockito.when(studentRepository.findAll()).thenReturn(Collections.emptyList());
		List<Student> actualStudentList = studentServices.getStudent();
		assertEquals(Collections.emptyList(), actualStudentList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
