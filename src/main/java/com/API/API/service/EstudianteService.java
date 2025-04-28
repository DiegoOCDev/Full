package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Estudiante;
import com.API.API.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    public Estudiante getEstudiante(int id) {  return estudianteRepository.GetEstudiante(id);}
    public String setEstudiante(Estudiante estudiante, int id) {return estudianteRepository.UpdateEstudiante(id,estudiante);}
    public String deleteEstudiante(int id) {return estudianteRepository.DeleteEstudiante(id);}
    public Estudiante addEstudiante(Estudiante estudiante){return estudianteRepository.AddEstudiante(estudiante);}
    public List<Estudiante> getEstudiantes(){return estudianteRepository.GetEstudiantes();}
}
