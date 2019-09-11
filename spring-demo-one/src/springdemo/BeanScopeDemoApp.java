package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from the bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Does it pointing to the same object? " + result);
		System.out.println("Memory location for theCoach: " + theCoach.toString());
		System.out.println("Memory location for alphaCoach: " + alphaCoach.toString());
		
		
		// close the context
		context.close();

	}

}
