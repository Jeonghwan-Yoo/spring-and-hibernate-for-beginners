package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach coach = context.getBean("myGolfCoach", Coach.class);
		Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);
		
		boolean result = (coach == alphaCoach);
		System.out.println("coach: " + coach);
		System.out.println("alphaCoach : " + alphaCoach);
		System.out.println("coach == alphaCoach: " + result);
		
		context.close();
	}

}
