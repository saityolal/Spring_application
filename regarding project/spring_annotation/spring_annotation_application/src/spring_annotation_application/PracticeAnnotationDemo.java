package spring_annotation_application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach =context.getBean("pingPongCoach",Coach.class);
		
		
		System.out.println("PingPongCoach says :   " + theCoach.getDailyWorkout());

		
		context.close();
		
	}

}
