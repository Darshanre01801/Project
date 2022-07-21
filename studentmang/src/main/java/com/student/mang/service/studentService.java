package com.student.mang.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.mang.entity.student;

@Service
public interface studentService {
	List<student> getAllStudents();
	student saveStudent(student student);
	student getStudentById(Long id);
	student updateStudent(student student);
	void deleteStudentById(Long id);

}
