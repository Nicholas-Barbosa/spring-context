package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {

	private final GreetingServiceImpl greetingService;

	public ConstructorInjectedController(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
