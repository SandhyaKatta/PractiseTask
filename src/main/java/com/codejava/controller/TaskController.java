package com.codejava.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TaskController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}	
	@GetMapping("/about")
	public String about() {
		return "about";
	}	
	@GetMapping("/select")
	public String select() {
		return "select";
	}		

}
