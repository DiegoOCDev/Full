package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Instructor;
import org.springframework.stereotype.Repository;
@Repository

public class InstructorRepository {
    private List<Instructor> instructors;
    public InstructorRepository(){

    }
    public InstructorRepository(List<Instructor> instructors) {
        this.instructors = instructors;
    }
    public List<Instructor> GetInstructors() {
        return instructors;
    }
    public void SetInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
    public Instructor GetInstructor(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }
    public Instructor AddInstructor(Instructor instructor) {
        instructors.add(instructor);
        return instructor;
    }
    public String UpdateInstructor(int id,Instructor instructor) {
       int index = 0;
       for (Instructor instructor1 : instructors) {
           if (instructor.getId() == id) {
               index = instructors.indexOf(instructor1);
               instructors.set(index, instructor);
               return "Instructor updated";
           }
       }
       return "Instructor not found";
    }
    public String DeleteInstructor(int id) {
        int index = 0;
        for (Instructor instructor1 : instructors) {
            if (instructor1.getId() == id) {
                index = instructors.indexOf(instructor1);
                instructors.remove(index);
                return "Instructor deleted";
            }
        }
        return "Instructor not found";
    }


}
