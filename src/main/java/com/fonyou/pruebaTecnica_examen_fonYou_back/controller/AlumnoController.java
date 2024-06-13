package com.fonyou.pruebaTecnica_examen_fonYou_back.controller;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Alumno;
import com.fonyou.pruebaTecnica_examen_fonYou_back.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = new AlumnoService();
    }

    @GetMapping
    public List<Alumno> getAlumnos(){
        return alumnoService.getAlumnos();
    }
}
