package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingInterface {

	@Override
	public String sayGreeting() {
		return "Helo World!";
	}
}
