package org.tnsif.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String display()
	{
		System.out.println("Hey, I am using SpringMVC");
		return "home.jsp";
	}

}
