package spring_annotation_application;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Jing Bong Ding Dong Hit Stone Cold Ayeeeeeh";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bing Chilling";
	}

}
