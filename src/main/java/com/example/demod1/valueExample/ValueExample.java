package com.example.demod1.valueExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueExample {
	
	
		@Value("VETRIVEL")
		public String name;
		@Value("19")
		public int age;
		@GetMapping("displayStudent")
		public String displayStudent() {
			return"My name is "+name+" age is "+age;
		}
	



}
