package com.ashish.controller.booking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	
	@RequestMapping("/bookingService")
	public ModelAndView bookRoom() {
		
		 System.out.println("BookingController.bookRoom()");
		 
		 ModelAndView modelAndView = new ModelAndView();
		 
		 modelAndView.setViewName("bookingConfirm");
		 
		 
		return modelAndView;
		 
		
	}

}
