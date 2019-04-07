package com.luv2code.springdemo.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach trackCoach1 = context.getBean("trackCoach", Coach.class);
		Coach trackCoach2 = context.getBean("trackCoach", Coach.class);
		
		// check if they are the same
		boolean result = (trackCoach1 == trackCoach2);		
		
		System.out.println("\nPointing to the same object: " + result);		
		System.out.println("\nMemory location for trackCoach1: " + trackCoach1);
		System.out.println("\nMemory location for trackCoach2: " + trackCoach2 + "\n");
		
		// retrieve bean from spring container
		Coach cricketCoach1 = context.getBean("cricketCoach", Coach.class);
		Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);
		
		// check if they are the same
		result = (cricketCoach1 == cricketCoach2);		
		
		System.out.println("\nPointing to the same object: " + result);		
		System.out.println("\nMemory location for cricketCoach1: " + cricketCoach1);
		System.out.println("\nMemory location for cricketCoach2: " + cricketCoach2 + "\n");
	
		// close the context
		context.close();
	}

}








