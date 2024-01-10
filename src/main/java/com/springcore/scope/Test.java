package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scope/config.xml");
		Student St = context.getBean(Student.class);
		System.out.println(St.hashCode());
		Student St1 = context.getBean(Student.class);
		System.out.println(St1.hashCode());
	}

}
