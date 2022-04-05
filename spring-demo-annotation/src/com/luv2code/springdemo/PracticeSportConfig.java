package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class PracticeSportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach wrestlingCoach() {
		WrestlingCoach wrestlingCoach = new WrestlingCoach(happyFortuneService());
		return wrestlingCoach;
	}
}
