package com.fonyou.pruebaTecnica_examen_fonYou_back.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="respuestas_has_alumnos")
public class RespuestaAlumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_respuesta_has_alumno")
    private Long id_respuesta_has_alumno;

    @ManyToOne
    @JoinColumn(name="alumno_id")
    Alumno alumno_id;

    @ManyToOne
    @JoinColumn(name="respuesta_id")
    Respuesta respuesta_id;
    //Constructor Sin Id
    public RespuestaAlumno(Alumno alumno_id, Respuesta respuesta_id) {
        this.alumno_id = alumno_id;
        this.respuesta_id = respuesta_id;
    }

    //Constructor con Id

    public RespuestaAlumno(Long id_respuesta_has_alumno, Alumno alumno_id, Respuesta respuesta_id) {
        this.id_respuesta_has_alumno = id_respuesta_has_alumno;
        this.alumno_id = alumno_id;
        this.respuesta_id = respuesta_id;
    }
}
