package com.dev.ATRTShop.controller.gngLanding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gngPlus")
public class GngPlusHomeController {

	@RequestMapping({"/",""})
	public String gngHome() {
		
		return "front/gngPlus/index";
	}
}
