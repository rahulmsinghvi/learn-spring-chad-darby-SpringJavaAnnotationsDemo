package com.udemy.spring.annotations.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Coming from HappyFortuneService in Annotations demo";
	}

}
