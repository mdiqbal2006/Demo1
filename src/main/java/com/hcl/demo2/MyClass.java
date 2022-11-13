package com.hcl.demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

public	void hello() {
	Logger log=LogManager.getLogger(MyClass.class);
		log.info("Hello");
		//log.error("Error in prog");
	}
}
