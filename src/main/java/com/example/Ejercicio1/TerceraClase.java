package com.example.Ejercicio1;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TerceraClase {
    @Bean
    CommandLineRunner ejecutame1(){
        System.out.println("Hola desde la tercera clase "+new Date().getTime()+" ");
        /*return p ->
        {
            System.out.println("Hola desde la tercera "+new Date().getTime());
        };*/
        return new Comando();
    }
}
