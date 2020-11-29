package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/*
		 * Ira retornar ao contexto da aplicacao.
		 */
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		/*
		 * Spring context criou um objeto do nosso bean e nos o recuperamos, passando para a referencia myController
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}

}
