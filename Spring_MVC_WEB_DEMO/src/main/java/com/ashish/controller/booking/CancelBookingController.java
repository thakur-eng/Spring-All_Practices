package com.ashish.controller.booking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CancelBookingController {

	@RequestMapping("/cancelBooking")   //  href="cancelBooking">Cancel Room both same requride in html page 
	public ModelAndView canceleRoom()
	
	{
		System.out.println("CancelBookingController.canceleRoom()");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("cancelConfirm"); // jsp file name is same 
		return modelAndView;

		
	}
}
