package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingpongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

}
