package com.shameenakoodan.CoachDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shameenakoodan.CoachDemo.myServices.Coach;

@SpringBootApplication
public class CoachDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoachDemoApplication.class, args);
		ConfigurableApplicationContext context =  SpringApplication.run(CoachDemoApplication.class, args);
		// get the bean from spring container
	     Coach theCoach = context.getBean(Coach.class);

	     // call a method on the bean
	     System.out.println(theCoach.getDailyWorkout());

	     // call method to get daily fortune
	     System.out.println(theCoach.getDailyFortune());

	     // close the context
	     context.close();

	}

}
