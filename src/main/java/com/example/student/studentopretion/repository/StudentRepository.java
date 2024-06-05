package com.example.student.studentopretion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.studentopretion.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findStudentByName(String name);

	Student findStudentByEnrollmentNo(String enrollmentNo);

	Student findStudentByEmail(String email);

}
