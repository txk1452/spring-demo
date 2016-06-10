package com.huawei.ewind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class RestController {

	@RequestMapping("hello")
	public String hello()
	{
		return "index";
	}
}
