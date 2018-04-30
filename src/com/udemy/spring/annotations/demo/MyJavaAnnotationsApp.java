package com.udemy.spring.annotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyJavaAnnotationsApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
		
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}
