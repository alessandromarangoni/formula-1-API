package it.betacom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "it.betacom.piloti")
@ComponentScan(basePackages = "it.betacom.scuderie")
public class FormulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormulaApplication.class, args);
	}

}
