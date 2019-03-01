package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringBootJDBC {

	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public ModelAndView getAllStudents() {
		List<Student> students= studentService.getAllStudents();
		
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.setViewName("students");
		modelAndView.addObject(students);
		
		System.out.println(students);
		
		return modelAndView;
	}
	
}
