package com.example.SpringBootStudentRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootStudentRegistration.entity.Student;
import com.example.SpringBootStudentRegistration.repository.StudentRepository;

@SpringBootApplication
public class SpringBootStudentRegistrationApplication implements CommandLineRunner{

	public static void main(String[] args)  {
		SpringApplication.run(SpringBootStudentRegistrationApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		  
		 
		
	
	}

}
