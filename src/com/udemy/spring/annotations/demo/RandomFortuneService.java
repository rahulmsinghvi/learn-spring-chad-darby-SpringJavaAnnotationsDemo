package com.udemy.spring.annotations.demo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Coming from RandomFortuneService in Annotations Demo";
	}

}
