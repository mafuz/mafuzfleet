package com.mandeyya.mafuzfleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String goHome() {
		
		return "index";
		
	}
	
	 @GetMapping("/user")
	    public String user() {
	        return ("<h1>Welcome User</h1>");
	    }
 
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
		
	}
	
	@GetMapping("/logout")
	public String logout() {
		
		return "login";
		
	}

	
}
