package com.fonyou.pruebaTecnica_examen_fonYou_back.service;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    public List<Alumno> getAlumnos(){
        return List.of(
            new Alumno(1L, "Karen Marlene Sandoval Velázquez", 16, "Tizayuca", "America / Ciudad de México", "Karen123!")
        );
    }
}
