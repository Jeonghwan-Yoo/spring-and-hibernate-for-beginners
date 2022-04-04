package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PingpongCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public PingpongCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
