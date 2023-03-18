package org.kgitbank.spring;

import org.springframework.stereotype.Component;

@Component
public class HelloService implements IGreetingService{

	public String sayGreet(String name) {
		return "Hello"+name+"!";
	}
	
}
