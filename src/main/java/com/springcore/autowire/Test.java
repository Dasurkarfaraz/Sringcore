package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext context= new  ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
	 emp  			emp=context.getBean("emp", emp.class);
	 System.out.println(emp);
	}

}
