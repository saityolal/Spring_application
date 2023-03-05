package spring_annotation_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public FootballCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println(">> FootballCoach: inside constructor using @autowired and @qualifier");
		this.fortuneService = fortuneService;
	}

	public FootballCoach() {

		System.out.println(">> FootballCoach: inside deafult constructor");
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

		return "Run 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
