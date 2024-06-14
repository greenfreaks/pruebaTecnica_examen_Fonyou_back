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
@Table(name="respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_respuesta")
    private Long id_respuesta;

    @Column(name = "respuesta")
    private String respuesta;

    @Column(name = "puntaje")
    private float puntaje;

    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    Pregunta pregunta_id;

    @OneToMany(mappedBy = "respuesta_id")
    List<RespuestaAlumno> respuestaAlumnoList;




    //Constructor SIN ID
    public Respuesta(String respuesta, float puntaje, Pregunta pregunta_id) {
        this.respuesta = respuesta;
        this.puntaje = puntaje;
        this.pregunta_id = pregunta_id;
    }

    //Constructor con ID

    public Respuesta(Long id_respuesta, String respuesta, float puntaje, Pregunta pregunta_id) {
        this.id_respuesta = id_respuesta;
        this.respuesta = respuesta;
        this.puntaje = puntaje;
        this.pregunta_id = pregunta_id;
    }
}
