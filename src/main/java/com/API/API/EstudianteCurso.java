package com.API.API;

import com.API.API.model.Curso;
import com.API.API.model.Estudiante;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estudiante_curso")
public class EstudianteCurso {
    @EmbeddedId
    private EstudianteCursoId id;

    @MapsId("idEstudiante")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante idEstudiante;

    @MapsId("idCurso")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCurso", nullable = false)
    private Curso idCurso;

}