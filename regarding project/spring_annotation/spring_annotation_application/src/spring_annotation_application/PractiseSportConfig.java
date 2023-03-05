package spring_annotation_application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PractiseSportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		
		return new HappyFortuneService();
	}
	
	
	@Bean
	public Coach wrestlingCoach() {
		
		return new WrestlingCoach(happyFortuneService());
	}

}
