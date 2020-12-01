package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyInjectedGreetingService")
	public GreetingService service;

	public String getGreeting() {
		return service.sayGreeting();
	}
}
