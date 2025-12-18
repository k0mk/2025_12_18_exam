package com.example.theme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String gomain() {
		return "/home/main";
	}
	
	@GetMapping("/home/main")
	public String gomain2() {
		return "/home/main";
	}
	
}
