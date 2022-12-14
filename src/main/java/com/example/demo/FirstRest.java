package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRest {

	@GetMapping(value = "/data")
	public String getdaa() {
		return "Hello Angular side data3";
	}	
	
}
