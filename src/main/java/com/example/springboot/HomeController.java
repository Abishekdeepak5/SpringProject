package com.example.springboot;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	// @GetMapping("/hello")
	// @RequestMapping("/", method=GET)
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	// @RequestMapping(value={"/","/home"},method=GET)
	

}