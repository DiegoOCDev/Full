package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Instructor;
import com.API.API.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {
@Autowired
    private InstructorRepository instructorRepository;
public Instructor addInstructor(Instructor instructor) {
    return instructorRepository.AddInstructor(instructor);
}
public Instructor getInstructor(int id) {
    return instructorRepository.GetInstructor(id);
}
public String updateInstructor(Instructor instructor,int id) {
    return instructorRepository.UpdateInstructor(id, instructor);
}
public String deleteInstructor(int id) {
    return instructorRepository.DeleteInstructor(id);
}
public List<Instructor> getInstructors() {
    return instructorRepository.GetInstructors();
}
}
