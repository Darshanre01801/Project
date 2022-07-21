package com.student.mang.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.mang.entity.student;
import com.student.mang.repository.studentRepository;
import com.student.mang.service.studentService;

@Service
public class studentServiceImpl implements studentService{
	
	private studentRepository studentRepository;

	public studentServiceImpl(studentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public student saveStudent(student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public student updateStudent(student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
		
	}

}
