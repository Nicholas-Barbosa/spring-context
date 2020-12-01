package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService gretingService;

	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGretingService(GreetingService gretingService) {
		this.gretingService = gretingService;
	}

	public String getGreeting() {
		return gretingService.sayGreeting();
	}
}
