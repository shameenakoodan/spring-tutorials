package com.shameenakoodan.SportDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shameenakoodan.SportDemo.myServices.ISportInterface;

@SpringBootApplication
public class SportDemoApplication {

	public static void main(String[] args) {
				ConfigurableApplicationContext context =  SpringApplication.run(SportDemoApplication.class, args);
				// get the bean from spring container
			     ISportInterface theSport = context.getBean(ISportInterface.class);

			     // call a method on the bean
			     System.out.println(theSport.getSportName());
			     System.out.println(theSport.getSportType());
			     System.out.println(theSport.getWin());


			     // close the context
			     context.close();
	}

}
