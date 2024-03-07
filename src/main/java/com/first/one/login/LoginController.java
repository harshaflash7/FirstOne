package com.first.one.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/loginpage")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@GetMapping("/loginpg")
	public String loginPg() {
		return "login";
	}
	
	@GetMapping("/get")
	public String getWelcome() {
		return "Welcome Harsha";
	}

}
