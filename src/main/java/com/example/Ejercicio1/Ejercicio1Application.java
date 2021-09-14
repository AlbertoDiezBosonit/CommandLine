package com.example.Ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
		ejecutame();
	}

	//@PostConstruct
	static public void ejecutame(){
		System.out.println("Hola desde la clase principal");
	}
}
