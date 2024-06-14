package com.fonyou.pruebaTecnica_examen_fonYou_back.controller;

import com.fonyou.pruebaTecnica_examen_fonYou_back.model.Profesor;
import com.fonyou.pruebaTecnica_examen_fonYou_back.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.List.of;

@RestController
@RequestMapping(path = "api/v1/profesor")
public class ProfesorController {
    /*private final ProfesorService profesorService;

    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = new ProfesorService();
    }*/
    /*Con esta función mandamos a llamar la lista de todos los profesores creados en ProfesorService*/
   /* @GetMapping
    public List<Profesor> getProfesores(){
        return profesorService.getProfesores();
    } */
}
