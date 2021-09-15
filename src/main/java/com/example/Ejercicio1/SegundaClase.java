package com.example.Ejercicio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SegundaClase {
    @Bean
    CommandLineRunner ejecutame2(){
        System.out.println("Hola desde la segunda clase, tiempo: "+new Date().getTime()+" ");
        return p ->
        {
          System.out.println("Hola desde la segunda clase desde el CommandLineRunner, tiempo: "+new Date().getTime()+" ");
        };

    }
}
