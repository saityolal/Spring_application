package spring_application;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

// create a no-arg constructor

	public CricketCoach() {
		System.out.println("CricketCoach:  inside no-arg costructor");
	}
	
	
// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:  inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {

		return "Practise fast bolwing for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
