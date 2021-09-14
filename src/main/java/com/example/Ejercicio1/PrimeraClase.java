package com.example.Ejercicio1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PrimeraClase {
    @PostConstruct
    public void ejecutame(){
        System.out.println("Hola desde la primera clase");
    }
}
