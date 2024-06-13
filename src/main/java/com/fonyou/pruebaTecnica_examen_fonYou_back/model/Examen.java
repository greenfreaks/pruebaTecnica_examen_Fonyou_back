package com.fonyou.pruebaTecnica_examen_fonYou_back.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name="examenes")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_examen")
    private Long id_examen;

    @Column(name = "nombre_examen")
    private String nombre_examen;

    @Column(name = "fecha_aplicacion")
    private String fecha_aplicacion;

    @Column(name = "hora_aplicacion")
    private String hora_aplicacion;

    //Se crea llave foránea con una relación de muchos a uno: "Muchos exámenes le pertenecen a un profesor"
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    Profesor profesor_id;


    //Constructor SIN ID
    public Examen(String nombre_examen, String fecha_aplicacion, String hora_aplicacion, Profesor profesor_id) {
        this.nombre_examen = nombre_examen;
        this.fecha_aplicacion = fecha_aplicacion;
        this.hora_aplicacion = hora_aplicacion;
        this.profesor_id = profesor_id;
    }

    //Constructo CON ID
    public Examen(Long id_examen, String nombre_examen, String fecha_aplicacion, String hora_aplicacion, Profesor profesor_id) {
        this.id_examen = id_examen;
        this.nombre_examen = nombre_examen;
        this.fecha_aplicacion = fecha_aplicacion;
        this.hora_aplicacion = hora_aplicacion;
        this.profesor_id = profesor_id;
    }
}
