package com.API.API.controller;

import org.springframework.web.bind.annotation.RestController;
import com.API.API.model.GerenteDeCursos;
import com.API.API.service.GerenteDeCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/GerenteDeCursos")

class GerenteDeCursosController {
    @Autowired
    GerenteDeCursosService gerenteDeCursosService;
    @GetMapping
    public List<GerenteDeCursos> getGerenteDeCursos(){
        return gerenteDeCursosService.getAllGerenteDeCursos();
    }
    @GetMapping("/{id}")
    public GerenteDeCursos getGerenteDeCursos(@PathVariable int id) {
        return gerenteDeCursosService.getGerenteDeCursos(id);
    }
    @PostMapping
    public GerenteDeCursos addGerenteDeCursos(@RequestBody GerenteDeCursos gerenteDeCursos) {
        return gerenteDeCursosService.addGerenteDeCursos(gerenteDeCursos);
    }
    @PutMapping("/{id}")
    public String updateGerenteDeCursos(@PathVariable int id, @RequestBody GerenteDeCursos gerenteDeCursos) {
        return gerenteDeCursosService.updateGerenteDeCursos(id, gerenteDeCursos);
    }
    @DeleteMapping("/{id]")
    public String deleteGerenteDeCursos(@PathVariable int id) {
        return gerenteDeCursosService.deleteGerenteDeCursosById(id);
    }

}
