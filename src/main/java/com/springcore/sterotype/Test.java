package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");
		Student St = context.getBean(Student.class);
		System.out.println(St);
	}

}
