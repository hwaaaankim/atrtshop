package com.dev.ATRTShop.controller.gngLanding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gng")
public class GngHomeController {

	@RequestMapping({"/",""})
	public String gngHome() {
		
		return "front/gng/index";
	}
}
