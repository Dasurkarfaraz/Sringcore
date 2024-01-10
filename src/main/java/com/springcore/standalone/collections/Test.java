package com.springcore.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
	
		Person company= (Person)context.getBean("person");
		System.out.println(company);	
	}

}
