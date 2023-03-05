package spring_annotation_application;

public class WrestlingCoach implements Coach {

	private FortuneService fortuneService;

	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Daily Practice for world champ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
