package com.udemy.spring.jaava.configurations;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Coming from HappyFortuneService in Java Configurations demo";
	}

}
