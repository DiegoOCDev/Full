package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Estudiante;
import org.springframework.stereotype.Repository;
@Repository

public class EstudianteRepository {
    private List<Estudiante> Estudiantes = new ArrayList<>();

    public EstudianteRepository(){


    }
    public EstudianteRepository(List<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;

    }
    public List<Estudiante> GetEstudiantes() {
        return Estudiantes;
    }
    public void SetEstudiantes(List<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }
    public Estudiante GetEstudiante(int id) {
        for (Estudiante Estudiante : Estudiantes) {
            if (Estudiante.getId() == id) {
                return Estudiante;
            }
        }
        return null;
    }
    public String AddEstudiante(Estudiante Estudiante) {
        Estudiantes.add(Estudiante);
        return "Estudiante added";
    }
    public String UpdateEstudiante(int id,Estudiante Estudiante) {
        int index = 0;
        for (Estudiante Estudiante1 : Estudiantes) {
            if (Estudiante1.getId() == id) {
                index = Estudiantes.indexOf(Estudiante1);
                Estudiantes.set(index, Estudiante);
                return "Estudiante updated";
            }
        }
        return "Estudiante not found";
    }
    public String DeleteEstudiante(int id) {
        for (Estudiante Estudiante1 : Estudiantes) {
            if (Estudiante1.getId() == id) {
                Estudiantes.remove(Estudiante1);
                return "Estudiante deleted";
            }
        }
        return "Estudiante not found";
    }
}
