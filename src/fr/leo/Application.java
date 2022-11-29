package fr.leo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import fr.leo.service.IMetier;

@ComponentScan(value = {"fr.leo.service","fr.leo.aspects"})
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Application.class); 
		
		IMetier metier = applicationContext.getBean(IMetier.class);
		System.out.println("***********************");
		System.out.println(metier.getClass().getName());
		System.out.println("***********************");	
		
		metier.process();
		System.out.println(metier.compute());
	}

}
