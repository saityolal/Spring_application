package spring_application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//call our new methods to get the literal values
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());

		GolfCoach theCoach1 = context.getBean("myGolfCoach", GolfCoach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		
		
		// close the context
		context.close();
	}

}
