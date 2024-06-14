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
@Table(name="preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_pregunta")
    private Long id_pregunta;

    @Column(name = "pregunta")
    private String pregunta;

    @ManyToOne
    @JoinColumn(name = "examen_id")
    Examen examen_id;

    @OneToMany(mappedBy = "pregunta_id")
    List<Respuesta> respuestaList;

    //Constructor SIN Id
    public Pregunta(String pregunta, Examen examen_id) {
        this.pregunta = pregunta;
        this.examen_id = examen_id;
    }

    //Constructor CON Id
    public Pregunta(Long id_pregunta, String pregunta, Examen examen_id) {
        this.id_pregunta = id_pregunta;
        this.pregunta = pregunta;
        this.examen_id = examen_id;
    }
}
