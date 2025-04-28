package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Evaluacion;
import com.API.API.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository evaluacionRepository;
    public List<Evaluacion> getEvaluaciones() {
        return evaluacionRepository.GetEvaluacions();
    }
    public Evaluacion getEvaluacion(int id) {return evaluacionRepository.GetEvaluacion(id);}
    public String updateEvaluacion(Evaluacion evaluacion,int id) {return evaluacionRepository.UpdateEvaluacion(id, evaluacion);}
    public String deleteEvaluacion(int id) {return evaluacionRepository.DeleteEvaluacion(id);}
    public Evaluacion addEvaluacion(Evaluacion evaluacion){return evaluacionRepository.AddEvaluacion(evaluacion);}
}
