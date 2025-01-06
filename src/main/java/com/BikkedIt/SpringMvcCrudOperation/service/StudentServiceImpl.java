package com.BikkedIt.SpringMvcCrudOperation.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.BikkedIt.SpringMvcCrudOperation.model.Student;
import com.BikkedIt.SpringMvcCrudOperation.repository.StuentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StuentRepository stuentRepository;

	@Override
	public Student saveStu(Student stu) {
		Student student = stuentRepository.save(stu);
		return student;
	}
}

