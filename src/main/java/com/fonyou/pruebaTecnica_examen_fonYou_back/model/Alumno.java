package com.fonyou.pruebaTecnica_examen_fonYou_back.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Long id_alumno;

    @Column(name = "nombre_alumno")
    private String nombre_alumno;

    @Column(name = "edad_alumno")
    private int edad_alumno;

    @Column(name = "ciudad_alumno")
    private String ciudad_alumno;

    @Column(name = "zonahoraria_alumno")
    private String zonahoraria_alumno;

    @Column(name = "contrasena_alumno")
    private String contrasena_alumno;

    @OneToMany(mappedBy = "alumno_id")
    List<RespuestaAlumno> respuestasAlumnosList;

    @OneToMany(mappedBy = "alumno_id")
    List<ExamenAlumno> examenAlumnoList;

    //Constructor SIN ID
    public Alumno(String nombre_alumno, int edad_alumno, String ciudad_alumno, String zonahoraria_alumno, String contrasena_alumno) {
        this.nombre_alumno = nombre_alumno;
        this.edad_alumno = edad_alumno;
        this.ciudad_alumno = ciudad_alumno;
        this.zonahoraria_alumno = zonahoraria_alumno;
        this.contrasena_alumno = contrasena_alumno;
    }

    //Constructor CON ID
    public Alumno(Long id_alumno, String nombre_alumno, int edad_alumno, String ciudad_alumno, String zonahoraria_alumno, String contrasena_alumno) {
        this.id_alumno = id_alumno;
        this.nombre_alumno = nombre_alumno;
        this.edad_alumno = edad_alumno;
        this.ciudad_alumno = ciudad_alumno;
        this.zonahoraria_alumno = zonahoraria_alumno;
        this.contrasena_alumno = contrasena_alumno;
    }
}
