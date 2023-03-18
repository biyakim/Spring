package org.kgitbank.work;

import org.kgitbank.spring.IGreetingService;
import org.springframework.stereotype.Component;

@Component
public class ByeService implements IGreetingService{
	
	public String sayGreet(String name) {
		return "Bye"+name+"!";
	}
}
