package org.shameenakoodan.MathComponentDemo;

import org.shameenakoodan.MathComponentDemo.controller.MathComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MathComponentDemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.shameenakoodan.MathComponentDemo.controller");
		context.refresh();
		MathComponent ms = context.getBean(MathComponent.class);
		int result = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);
		context.close();	}

}
