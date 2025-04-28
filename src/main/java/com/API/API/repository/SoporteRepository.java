package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Soporte;
import org.springframework.stereotype.Repository;
@Repository

public class SoporteRepository {
    private List<Soporte> soportes;
    public SoporteRepository(){

    }
    public List<Soporte> getSoportes() {
        return soportes;
    }
    public void SetSoportes(List<Soporte> soportes) {
        this.soportes = soportes;
    }
    public Soporte AddSoporte(Soporte soporte){
        this.soportes.add(soporte);
        return soporte;
    }
    public String DeleteSoporte(int id){
        int index = 0;
        for (Soporte s : soportes) {
            if(s.getId() == id){
                index = soportes.indexOf(s);
                soportes.remove(index);
                return "Soporte removed!";
            }
        }
        return "Soporte no encontrado!";
    }
    public String UpdateSoporte(int id,Soporte soporte){
        int index = 0;
        for (Soporte s : soportes) {
            if(s.getId() == id){
                index = soportes.indexOf(s);
                soportes.set(index, s);
                return "Soporte updated!";
            }
        }
        return "Soporte no encontrado!";
    }
    public Soporte GetSoporte(int id){
        for (Soporte s : soportes) {
            if(s.getId() == id){
                return s;

            }
        }
        return null;
    }

}
