package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		company company= (company)context.getBean("Company");
		System.out.println(company);
		
		Addition addition=	(Addition)context.getBean("Addition");
	
		addition.doSum();
		
	}

}
