package spring_application;

import java.util.Random;

public class MixFortuneService implements FortuneService {

	
	private String[] Data = {
			"Today is a BAD day",
			"Today is a GOOD day",
			"Today is a MANAGEABLE day"
	};		
			
	 	
	// create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		
		int Index = myRandom.nextInt(3);
		return Data[Index];
	}

}
