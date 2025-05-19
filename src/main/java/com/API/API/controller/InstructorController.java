package com.API.API.controller;

import org.springframework.web.bind.annotation.RestController;
import com.API.API.model.Instructor;
import com.API.API.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Instructors")

class InstructorController {
    @Autowired
    private InstructorService instructorService;
    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getInstructors();
    }
    @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable int id) {
        return instructorService.getInstructor(id);
    }
    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }
    @PutMapping("/{id}")
    public String updateInstructor(@PathVariable int id, @RequestBody Instructor instructor) {
       return instructorService.updateInstructor(instructor,id);
    }
    @DeleteMapping("/{id]")
    public String deleteInstructor(@PathVariable int id) {
        return instructorService.deleteInstructor(id);
    }

}
