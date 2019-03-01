package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepositary studentRepositary;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> getAllStudents(){
		List<Student> students=new ArrayList<>();
		studentRepositary.findAll().forEach(students::add);
		return students;
	}	
}
