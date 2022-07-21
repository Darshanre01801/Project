package com.student.mang;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.mang.entity.student;
import com.student.mang.repository.studentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmangApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmangApplication.class, args);
	}
    
	@Autowired
	private studentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
