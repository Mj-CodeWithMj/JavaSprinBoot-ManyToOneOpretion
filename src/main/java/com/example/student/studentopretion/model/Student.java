package com.example.student.studentopretion.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  id;
	
	private String name;
	private String enrollmentNo;
	private String email;	
	@ManyToOne
	@JoinColumn(name ="course_id")
	private Course course;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student() {
		
	}

	public Student( String name, String enrollmentNo, String email) {
		super();

		this.name = name;
		this.enrollmentNo = enrollmentNo;
		this.email = email;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", enrollmentNo=" + enrollmentNo + ", email=" + email
				+ ", course=" + course + "]";
	}
	
	
	
	
}
