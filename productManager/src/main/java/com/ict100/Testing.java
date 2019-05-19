package com.ict100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Testing {
	public static void main(String args[]){
		SpringApplication.run(Testing.class, args);
		
	}
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "how to configure springboot port";
	}
}
