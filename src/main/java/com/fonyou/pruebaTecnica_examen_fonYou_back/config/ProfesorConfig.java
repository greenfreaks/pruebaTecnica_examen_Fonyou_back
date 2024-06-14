package com.fonyou.pruebaTecnica_examen_fonYou_back.config;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Profesor;
import com.fonyou.pruebaTecnica_examen_fonYou_back.repository.ProfesorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfesorConfig {

    //Tendrá acceso a nuestro repositorio
    @Bean
    CommandLineRunner commandLineRunner(ProfesorRepository repository){
        return args ->{
            Profesor mario = new Profesor("Mario Sandoval Velázquez", "Mario123!");
            Profesor patricio = new Profesor("Patricio Piña", "Patricio123!");
        };
    }
}
