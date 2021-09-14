package com.example.Ejercicio1;

import org.springframework.boot.CommandLineRunner;

import java.util.Date;

public class Comando implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde la tercera clase "+new Date().getTime()+" ");
        for(String argumento:args)
            System.out.println(argumento);
    }
}
