package com.irenegogo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;

@Component
public class loginAuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equals("irene");
		boolean isValidPassword = password.equals("gogo");
		return isValidUserName && isValidPassword;
	}
}
