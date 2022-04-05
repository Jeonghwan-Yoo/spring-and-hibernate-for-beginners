package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
public class SportConfig2 {
	
	@Bean
	public MyLoggerConfig2 myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										@Value("${printed.logger.level}") String printedLoggerLevel) {
			MyLoggerConfig2 myLoggerConfig = new MyLoggerConfig2(rootLoggerLevel, printedLoggerLevel);
			return myLoggerConfig;
	}
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		return mySwimCoach;
	}
}
