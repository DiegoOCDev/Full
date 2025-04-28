package com.API.API.repository;

import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Admin;
import com.API.API.model.Curso;
import org.springframework.stereotype.Repository;
@Repository

public class CursoRepository {
    private List<Curso> Cursos = new ArrayList<>();
    public CursoRepository(){


    }
    //Crud
    public CursoRepository(List<Curso> Cursos) {
        this.Cursos = Cursos;
    }
    public List<Curso> GetCursos() {
        return Cursos;
    }
    public void SetCursos(List<Curso> Cursos) {
        this.Cursos = Cursos;

    }
    public Curso GetCurso(int id) {
        for (Curso curso : Cursos) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        return null;
    }
    public String AddCurso(Curso curso) {
        Cursos.add(curso);
        return "Curso added";

    }
    public String UpdateCurso(int id,Curso curso) {
        int index = 0;

        for (Curso curso1 : Cursos) {
            if (curso1.getId() == id) {
                index = Cursos.indexOf(curso1);
                Cursos.set(index, curso);

                return "Curso updated";
            }
        }
        return "no Curso found";
    }
    public String DeleteCurso(int id) {
        for (Curso curso : Cursos) {
            if (curso.getId() == id) {
                Cursos.remove(curso);
                return "Curso deleted";
            }
        }
        return "no Curso found";
    }


}
