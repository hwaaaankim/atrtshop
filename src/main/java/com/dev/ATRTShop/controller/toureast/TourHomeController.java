package com.dev.ATRTShop.controller.toureast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/toureast")
@Controller
public class TourHomeController {

	@RequestMapping({"/index",""})
	public String tourEastHome() {
		
		return "front/tour/index";
	}
	
	@RequestMapping("/contact")
	public String tourContact() {
		
		return "front/tour/contact";
	}
	
	@RequestMapping("/parisDetail")
	public String parisDetail() {
		
		return "front/tour/parisDetail";
	}
	
	@RequestMapping("/italiaDetail")
	public String italiaDetail() {
		
		return "front/tour/italiaDetail";
	}
}
