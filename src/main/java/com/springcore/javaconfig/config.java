package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class config {

	
	@Bean
	public Student test() {
		Student st = new Student();
		return st;
	}
}
