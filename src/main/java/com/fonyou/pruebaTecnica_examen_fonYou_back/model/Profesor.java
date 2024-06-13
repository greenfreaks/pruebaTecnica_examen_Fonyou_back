package com.fonyou.pruebaTecnica_examen_fonYou_back.model;

import jakarta.persistence.*;

//Import Lombok
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long id_profesor;

    @Column(name="nombre_profesor")
    private String nombre_profesor;

    @Column (name = "contrasena_profesor")
    private String contrasena_profesor;

    //Se relaciona De uno a muchos: "Un profeso puede tener varios examenes"

    @OneToMany(mappedBy = "profesor_id")
    List<Examen> examenList;

    //Constructor
    public Profesor(Long id_profesor, String nombre_profesor, String contrasena_profesor) {
        this.id_profesor = id_profesor;
        this.nombre_profesor = nombre_profesor;
        this.contrasena_profesor = contrasena_profesor;
    }

    //Constructor sin ID
    public Profesor(String nombre_profesor, String contrasena_profesor) {
        this.nombre_profesor = nombre_profesor;
        this.contrasena_profesor = contrasena_profesor;
    }

    public Long getId_profesor() {
        return id_profesor;
    }
}
