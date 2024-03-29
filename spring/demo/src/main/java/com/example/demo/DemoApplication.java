package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();

		for(String name : beanNames) {
			if(!(name.startsWith("org.") || name.startsWith("spring."))){
				System.out.println(name);
			}

		}
		MyBean bean1 = (MyBean) context.getBean("myBean");
		MyBean bean2 = (MyBean) context.getBean("myBean");
		System.out.println(bean1 == bean2);

		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		greetingService.greet();
//		System.out.println(bean);
//		//Person p = (Person) context.getBean(Person.class);
//		Person p = (Person) context.getBean("myPerson");
//		System.out.println(p);
//
//		MyCalculatorService calculatorService = (MyCalculatorService) context.getBean("myCalculatorService");
//		calculatorService.calcAdd(3,5);

	}

}
