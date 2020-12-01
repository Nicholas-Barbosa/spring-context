package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {

	/*
	 * Esta classe sera gerenciada pelo spring. Spring context e tudo que sera
	 * exibido na sua aplicacao, como esta classe.
	 * 
	 * O spring ira procurar e criar um objeto desta classe se ele nao achar. Sendo
	 * assim, sera disponibilizados referencias para esta classe no contexto spring,
	 * que vc pode recuperar.
	 */

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
