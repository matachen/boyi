package com.boyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value="/loginUser")
	@ResponseBody
	public String loginUser() {
		return "aaa";
		
	}

}
