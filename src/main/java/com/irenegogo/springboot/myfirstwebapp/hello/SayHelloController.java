package com.irenegogo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//web UI-related component, that handles requests
@Controller
public class SayHelloController {
	//"say-hello" -> "Hello! What are you learning today?"
	
	@RequestMapping("say-hello")
	@ResponseBody
	// it will return whatever is returned by this message as is to the browser
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	// it will return whatever is returned by this message as is to the browser
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML Page - changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML Page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
}
