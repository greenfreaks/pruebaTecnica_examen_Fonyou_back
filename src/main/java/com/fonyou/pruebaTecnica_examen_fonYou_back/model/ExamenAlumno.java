package com.fonyou.pruebaTecnica_examen_fonYou_back.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="exmenes_has_alumnos")
public class ExamenAlumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_examen_has_alumno")
    private Long id_examen_has_alumno;

    @ManyToOne
    @JoinColumn(name = "alumno_id")
    Alumno alumno_id;

    @ManyToOne
    @JoinColumn(name = "examen_id")
    Examen examen_id;

    @Column(name = "calificacion")
    private float calificacion;


    //Constructor sin Id
    public ExamenAlumno(Alumno alumno_id, Examen examen_id, float calificacion) {
        this.alumno_id = alumno_id;
        this.examen_id = examen_id;
        this.calificacion = calificacion;
    }

    //Constructor con Id

    public ExamenAlumno(Long id_examen_has_alumno, Alumno alumno_id, Examen examen_id, float calificacion) {
        this.id_examen_has_alumno = id_examen_has_alumno;
        this.alumno_id = alumno_id;
        this.examen_id = examen_id;
        this.calificacion = calificacion;
    }
}
