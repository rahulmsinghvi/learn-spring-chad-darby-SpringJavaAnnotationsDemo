package com.udemy.spring.jaava.configurations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyJavaConfigurationsApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getNameFile());
		context.close();
	}

}
