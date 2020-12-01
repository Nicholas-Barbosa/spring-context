package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/*
		 * Ira retornar ao contexto da aplicacao.
		 */
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		/*
		 * Spring context criou um objeto do nosso bean e nos o recuperamos, passando
		 * para a referencia myController
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println("----Primary Bean");
		System.out.println(greeting);

		System.out.println("----property");

		PropertyInjectedController propertyController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyController.getGreeting());

		System.out.println("----Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayHello());

	
	}

}
