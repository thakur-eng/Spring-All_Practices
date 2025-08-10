package com.springmvc.webapp.adhar.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.webapp.adhar.recource.JdbcConfig;

 
@Controller
public class AadharController {

	@GetMapping("/showRegisterForm")
	public String showRegisterForm() {

		System.out.println("TestController.showRegisterForm()");

		return "showRegisterForm";
	}

	@PostMapping("/register")
	@ResponseBody
	public String registerForAadhar(@RequestParam("firstName") String firstName,
			@RequestParam("mobile") String mobile) {
		System.out.println("registerForAadhar:::::::::");
		System.out.println("First Name: " + firstName);
		System.out.println("Mobile: " + mobile);

		// Call Service and DAO.. Insert Data into database....

		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate template = (JdbcTemplate) context.getBean("createJdbcTemplate");

		String sql = "INSERT INTO aadhar_reg (first_name, mobile) VALUES (?, ?)";
		int count = template.update(sql, firstName, mobile);

		
		
		return "You have registered for an aadhar. You will receive an update on your registered mobile number: "
				+ mobile;
	}
}
