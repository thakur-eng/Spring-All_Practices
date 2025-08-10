package com.aadhar.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aadhar.registration.service.AadharRegistrationService;

@Controller
public class AadharRegistrationController {

	@Autowired
	private AadharRegistrationService service;

	@GetMapping("/") // ✅ Correct GET mapping to show form
	public String showForm() {
		return "aadhar_form"; // loads /WEB-INF/views/aadhar_form.jsp
	}

	@PostMapping("/register")
	@ResponseBody
	public String registerForAadhar(@RequestParam("firstName") String firstName,
			@RequestParam("mobile") String mobile) {
		service.registerAadhar(firstName, mobile);
		return "You have registered for an Aadhar. Confirmation will be sent to mobile: " + mobile;
	}
}
