package com.luv2code.springdemo.setter.injection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
