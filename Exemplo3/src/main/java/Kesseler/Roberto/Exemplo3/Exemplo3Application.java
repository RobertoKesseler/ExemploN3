package Kesseler.Roberto.Exemplo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exemplo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo3Application.class, args);
		System.out.println("Hello World");
        System.out.println("Exemplo SpringBoot com Server Tomcat");
	}

}
