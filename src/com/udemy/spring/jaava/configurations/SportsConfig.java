package com.udemy.spring.jaava.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.udemy.spring.jaava.configurations")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	@Bean
	public HappyFortuneService happyFortuneService()
	{
		return new HappyFortuneService();
	}
	
	@Bean
	public TennisCoach tennisCoach(){
		return new TennisCoach(happyFortuneService());
	}
}
