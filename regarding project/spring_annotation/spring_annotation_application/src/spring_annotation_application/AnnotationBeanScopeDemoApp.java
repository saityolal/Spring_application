package spring_annotation_application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("foo",Coach.class);
		
		Coach alphaCoach = context.getBean("foo",Coach.class);
	
		//check if they are same
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\nPointing same object : " + result);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);
	
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach +"\n");
		
		context.close();
	}
	

}
