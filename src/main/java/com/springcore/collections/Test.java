package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		emp emp = (com.springcore.collections.emp) context.getBean("emp");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProps());

	}

}
