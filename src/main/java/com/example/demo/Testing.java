package com.example.demo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hcl.demo2.MyClass;

@Component
public class Testing {

	Logger log=LogManager.getLogger(Testing.class);
	
	@Value("${welcome.message}")
	private String welcome;
	
	@Value("${city.name:Default city}")
	private String city; 
	
	private List<String> cities;

public	void display() {		
		System.out.println("from prop "+city);
	}
	
public	String getData() {
		return welcome;
	}

}
