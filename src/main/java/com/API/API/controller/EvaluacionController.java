package com.API.API.controller;

import org.springframework.web.bind.annotation.RestController;
import com.API.API.model.Evaluacion;
import com.API.API.service.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Evaluacions")

class EvaluacionController {
    @Autowired
    EvaluacionService evaluacionService;
    @GetMapping
    public List<Evaluacion> getEvaluacions() {
        return evaluacionService.getEvaluaciones();
    }
    @GetMapping("/{id}")
    public Evaluacion getEvaluacion(@PathVariable int id) {
        return evaluacionService.getEvaluacion(id);
    }
    @PostMapping
    public Evaluacion addEvaluacion(@RequestBody Evaluacion evaluacion) {
        return evaluacionService.addEvaluacion(evaluacion);
    }
    @PutMapping("/{id}")
    public String updateEvaluacion(@PathVariable int id, @RequestBody Evaluacion evaluacion) {
        return evaluacionService.updateEvaluacion(evaluacion, id);
    }
    @DeleteMapping("/{id}")
    public String deleteEvaluacion(@PathVariable int id) {
        return evaluacionService.deleteEvaluacion(id);
    }
}
