package com.example.SpringBootStudentRegistration.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootStudentRegistration.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
