package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(swimCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(swimCoach.getDailyFortune());
		
//		System.out.println(swimCoach.getEmail());
//		System.out.println(swimCoach.getTeam());
		
		// close the context
		context.close();
	}

}
