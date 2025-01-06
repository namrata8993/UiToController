package com.BikkedIt.SpringMvcCrudOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkedIt.SpringMvcCrudOperation.model.Student;
import com.BikkedIt.SpringMvcCrudOperation.service.StudentServiceI;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;
	
	

	@GetMapping("/welcomePage")
	public String preReg() {
		
		
		
		return "welcome";
}
	@GetMapping("/saveStu")
	public ModelAndView saveStu(Student stu) {
		
		System.out.println(stu);
	Student saveStu = studentServiceI.saveStu(stu);
		ModelAndView mav= new ModelAndView();
		mav.addObject("STU",saveStu);
		mav.setViewName("RegSuccess");
		return mav;
	}
	}

