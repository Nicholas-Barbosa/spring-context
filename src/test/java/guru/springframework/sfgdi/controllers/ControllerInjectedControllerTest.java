package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorGreetingService;

class ControllerInjectedControllerTest {

	private ConstructorInjectedController greetingService;

	@BeforeEach
	void setUp() {
		/*
		 * Wrapping -> processo na qual uma instancia e passada para um construtor de
		 * outra classe,....
		 */
		greetingService = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void testSayHello() {
		System.out.println(greetingService.sayHello());
	}

}
