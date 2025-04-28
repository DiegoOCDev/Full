package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Evaluacion;
import org.springframework.stereotype.Repository;
@Repository

public class EvaluacionRepository {
    private List<Evaluacion> evaluacions = new ArrayList<>();

    public EvaluacionRepository(){


    }
    public void AddEvaluacion(Evaluacion evaluacion){
        evaluacions.add(evaluacion);
    }
    public List<Evaluacion> GetEvaluacions(){
        return evaluacions;
    }
    public Evaluacion GetEvaluacion(int id){
        for(Evaluacion evaluacion : evaluacions){
            if(evaluacion.getId() == id){
                return evaluacion;
            }
        }
        return null;
    }
   public String DeleteEvaluacion(int id){
        for(Evaluacion evaluacion : evaluacions){
            if(evaluacion.getId() == id){
                evaluacions.remove(evaluacion);
                return "Eliminado";
            }
        }
        return "No hay evaluacion";
   }
   public String UpdateEvaluacion(int id,Evaluacion evaluacion){
        int index = 0;
        for(Evaluacion evaluacion1 : evaluacions){
            if(evaluacion1.getId() == id){
                index = evaluacions.indexOf(evaluacion1);
                evaluacions.set(index, evaluacion);
                return "Actualizado";
            }
        }
        return "No hay evaluacion";
   }

}
