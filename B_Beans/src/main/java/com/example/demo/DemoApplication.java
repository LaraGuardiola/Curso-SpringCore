package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("primerbean.xml");
		
		Saludator saludador = null;
		
		// 1. getBean con ID y casting
		//saludador = (Saludator) appContext.getBean("saludator");
		
		// 2. getBean con ID y tipo
		saludador = appContext.getBean("saludator", Saludator.class);
		
		// 3. getBean con tipo
		//saludador = appContext.getBean(Saludator.class);
				
		System.out.println(saludador.saludo());
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
