package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A A = (A)context.getBean("A");
		System.out.println(A.gety());
		System.out.println(A.getOb());
		System.out.println(A.getOb().getX());
		

	}

}
