package com.udemy.spring.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	/*@Autowired
	@Qualifier("happyFortuneService")*/
	FortuneService fortuneService; // = new RandomFortuneService();;
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void settingFortuneService(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
/*	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Coming from TennisCoach in annotations' demo";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
