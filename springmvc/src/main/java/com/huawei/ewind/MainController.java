package com.huawei.ewind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("admin")
	public String adminPage() {
		logger.debug("access admin page.");
		return "adminpage";
	}
	
	@RequestMapping("common")
	public String commonPage() {
		logger.debug("access common page.");
		return "commonpage";
	}
}
