package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

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
	public String sayHello() {
		return "Hi Folks!";
	}
}
