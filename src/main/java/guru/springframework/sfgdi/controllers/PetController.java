package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

@Controller
public class PetController {

	private final PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}

	public String message() {
		/*
		 * Ocorre o override de acordo com o profile
		 */
		return petService.saySomething();
	}
}
