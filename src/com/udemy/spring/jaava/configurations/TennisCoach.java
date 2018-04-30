package com.udemy.spring.jaava.configurations;

import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Value("name")
	String nameFile;
	
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Coming from TennisCoach in Java configurations demo";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getNameFile()
	{
		return nameFile;
	}
	

}
