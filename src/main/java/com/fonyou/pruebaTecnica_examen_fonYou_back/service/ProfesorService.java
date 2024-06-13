package com.fonyou.pruebaTecnica_examen_fonYou_back.service;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Profesor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    * Función para crear a todos los objetos de tipo profesor que necesitemos
    * Recordemos que podemos crear a este objeto de tipo profesor porque en el Modelo Profesor ya creamos su estructura
    *
*/
@Service
public class ProfesorService {
    public List<Profesor> getProfesores(){
        return List.of(
                new Profesor(1L, "Mario Sandoval Velázquez", "Mario123!")
        );
    }
}
