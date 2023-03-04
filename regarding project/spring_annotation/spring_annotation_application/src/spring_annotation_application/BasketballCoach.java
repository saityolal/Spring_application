package spring_annotation_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public BasketballCoach(@Qualifier("fileFortuneService")FortuneService fortuneService){
		
		this.fortuneService = fortuneService;
	}
	
	
	
	
	@Override
	public String getDailyWorkout() {

		return "Playin Basketball since sunrise";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
