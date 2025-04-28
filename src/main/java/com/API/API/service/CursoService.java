package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Curso;
import com.API.API.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;
    public Curso getCurso(int id) {
       return cursoRepository.GetCurso(id);
    }
    public String updateCurso(Curso curso,int id) {
        return cursoRepository.UpdateCurso(id, curso);
    }
    public String deleteCurso(int id) {
        return cursoRepository.DeleteCurso(id);
    }
    public Curso addCurso(Curso curso) {
        return cursoRepository.AddCurso(curso);
    }
    public List<Curso> getAllCursos() {
        return cursoRepository.GetCursos();
    }
}
