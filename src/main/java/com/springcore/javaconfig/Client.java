package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
	Student st1 = context.getBean(Student.class);
//	System.out.println(st.getClass());
	System.out.println(st1);
	}

}
