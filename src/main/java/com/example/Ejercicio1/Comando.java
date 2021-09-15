package com.example.Ejercicio1;

import org.springframework.boot.CommandLineRunner;

import java.util.Date;

public class Comando implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        int i=0;
        System.out.println("Hola desde el CommandLineRunner de la tercera clase, tiempo:"+new Date().getTime()+" ");
        for(String argumento:args) {
            i++;
            System.out.println("Argumento número: " + i + " parámetro: "+argumento);
        }
    }
}
