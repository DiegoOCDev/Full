package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.GerenteDeCursos;
import com.API.API.repository.GerenteDeCursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenteDeCursosService {
 @Autowired
    private GerenteDeCursosRepository gerenteDeCursosRepository;
 public GerenteDeCursos addGerenteDeCursos(GerenteDeCursos gerenteDeCursos){return gerenteDeCursosRepository.AddGerenteDeCurso(gerenteDeCursos);
 }
 public GerenteDeCursos getGerenteDeCursos(int id){
     return gerenteDeCursosRepository.GetGerenteDeCurso(id);
 }
 public String updateGerenteDeCursos(int id, GerenteDeCursos gerenteDeCursos){
     return  gerenteDeCursosRepository.UpdateGerenteDeCurso(id, gerenteDeCursos);
 }
 public String deleteGerenteDeCursosById(int id){
     return gerenteDeCursosRepository.DeleteGerenteDeCurso(id);
 }
 public List<GerenteDeCursos> getAllGerenteDeCursos(){
     return gerenteDeCursosRepository.GetGerenteDeCursos();
 }

}
