package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.GerenteDeCursos;
import org.springframework.stereotype.Repository;
@Repository

public class GerenteDeCursosRepository {
    private List<GerenteDeCursos> gerenteDeCursos = new ArrayList<>();
    public GerenteDeCursosRepository(){
        super();
    }
    public List<GerenteDeCursos> GetGerenteDeCursos(){
        return gerenteDeCursos;
    }
    public String AddGerenteDeCurso(GerenteDeCursos gerenteDeCurso){
        gerenteDeCursos.add(gerenteDeCurso);
        return "Gerente de cursos added";
    }
    public GerenteDeCursos GetGerenteDeCurso(int id){
        for(GerenteDeCursos g : gerenteDeCursos){
            if(g.getId() == id){
                return g;
            }
        }
        return null;
    }
    public String UpdateGerenteDeCurso(int id,GerenteDeCursos g){
        int index = 0;
        for(GerenteDeCursos g1 : gerenteDeCursos){
            if(g1.getId() == id){
                index = gerenteDeCursos.indexOf(g1);
                gerenteDeCursos.set(index, g);
                return "Gerente de cursos updated";
            }
        }
        return "Gerente de cursos updated";
    }
    public String DeleteGerenteDeCurso(int id){
        int index = 0;
        for(GerenteDeCursos g1 : gerenteDeCursos){
            if(g1.getId() == id){
                index = gerenteDeCursos.indexOf(g1);
                gerenteDeCursos.remove(index);
                return "Gerente de cursos deleted";
            }
        }
        return "Gerente de cursos deleted";
    }
}
