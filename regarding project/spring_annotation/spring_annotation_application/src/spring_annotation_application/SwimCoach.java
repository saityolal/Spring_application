package spring_annotation_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public SwimCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		System.out.println(">> SwimCoach: inside constructor using @autowired and @qualifier");
		this.fortuneService=fortuneService;		
	}
	
	public SwimCoach() {
		
		System.out.println(">> SwimCoach: inside deafult constructor");
	}
	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
