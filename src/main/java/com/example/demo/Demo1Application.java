package com.example.demo;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.hcl.demo2.MyClass;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","com.hcl.demo2"})
public class Demo1Application  implements CommandLineRunner{

	@Autowired
	Testing test;
	@Autowired
	MyClass mcls;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {		
		System.out.println(test.getData());
		test.display();
		
		mcls.hello();
		
		
	}

	

	
		
	

}
