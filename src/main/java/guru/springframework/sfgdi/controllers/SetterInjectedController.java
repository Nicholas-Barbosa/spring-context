package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {

	private GreetingServiceImpl gretingService;

	@Autowired
	public void setGretingService(GreetingServiceImpl gretingService) {
		this.gretingService = gretingService;
	}

	public String getGreeting() {
		return gretingService.sayGreeting();
	}
}
