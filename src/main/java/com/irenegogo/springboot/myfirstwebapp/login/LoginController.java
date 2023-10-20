package com.irenegogo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private loginAuthenticationService authenticationService;
	
	public LoginController(loginAuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, 
			@RequestParam String password,
			ModelMap model) {
		model.put("name", name);
		//Authentication
		//name - irene
		//password - gogo
		if (authenticationService.authenticate(name, password)) {
			return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials! Please try again.");
			return "login";
		}
	}

}
