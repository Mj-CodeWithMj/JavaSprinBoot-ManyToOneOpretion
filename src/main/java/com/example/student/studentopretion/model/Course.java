package com.example.student.studentopretion.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String courseName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
//	public Set<Student> getStudents() {
//		return students;
//	}
//	public void setStudents(Set<Student> students) {
//		this.students = students;
//	}
	public Course() {
		
	}
	public Course(long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}
		
	
	
	
}
