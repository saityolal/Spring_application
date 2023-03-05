package spring_annotation_application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PracticeSportConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PractiseSportConfig.class);
		
		Coach theCoach = context.getBean("wrestlingCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

	}

}
