
package spring_annotation_application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifeCycleDemoApp {

	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Coach theCoach = context.getBean("foo",Coach.class);

		
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();
		
	}
  
}
