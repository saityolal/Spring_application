package spring_application;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(){}
	
	public GolfCoach(FortuneService fortuneService) {
		
		this.fortuneService=fortuneService;		
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "It's been long day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
