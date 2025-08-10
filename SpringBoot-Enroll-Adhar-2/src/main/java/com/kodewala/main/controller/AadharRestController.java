package com.kodewala.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.main.beans.AadharInfo;
import com.kodewala.main.services.AadharRegistrationImpl;

@RestController
@RequestMapping("/api/aadhar")
public class AadharRestController {

	private final AadharController aadharController;

	@Autowired
	private AadharRegistrationImpl aadharResistration;

	AadharRestController(AadharController aadharController) {
		this.aadharController = aadharController;
	}

	@PostMapping("/register")
	public ResponseEntity<Map<String, Object>> registerAadhar(@RequestBody AadharInfo aadharInfo) {

		boolean status = aadharResistration.doAadharRegistration(aadharInfo);
		System.out.println("AadharRestController.registerAadhar() and status is " + status);

		Map<String, Object> responce = new HashMap<>();
		if (status) {
			responce.put("message", "Aadhar registration successful");
			responce.put("status", true);
			return ResponseEntity.ok(responce);

		} else {

			responce.put("message", "Aadhar registration failed");
			responce.put("status", false);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responce);

		}

	}
}
