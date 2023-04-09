package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateAndTime {
	@GetMapping(value="/")
	public LocalDateTime disp() {
		LocalDateTime now = LocalDateTime.now();
		return now;
	}
	
	@GetMapping(value="/hello")
	public String gethello() {
		
		return "Hello Abhishek";
	}
}
