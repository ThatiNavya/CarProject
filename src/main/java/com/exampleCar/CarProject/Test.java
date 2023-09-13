package com.exampleCar.CarProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car c =context.getBean("car" ,Car.class);
		c.drive();
	}
    
	                   
}
