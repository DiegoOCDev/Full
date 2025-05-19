package com.API.API.service;
import java.util.List;

import com.API.API.model.Admin;
import org.springframework.stereotype.Service;
import com.API.API.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AdminService {
 @Autowired
    private AdminRepository repository;
 public Admin addAdmin(Admin admin) {
     repository.save(admin);
     return admin;
 }
 public String deleteAdmin(int id) {
     if(repository.existsById(id)){
         repository.deleteById(id);
         return "eliminado con exito";
     }else{
         return "No se encuentra";
     }
 }
 public String updateAdmin(int id,Admin admin) {
     if(repository.existsById(id)){
         Admin buscado =  repository.findById(id).get();
         buscado.setCorreoAdmin(admin.getCorreoAdmin());
         buscado.setNombreAdmin(admin.getNombreAdmin());
         repository.save(buscado);

         return " actualizado con exito";
     }else{
         return  "No se encuentra ";
     }

 }
    public String getAdmin(int id){
        String output="";
        if(repository.existsById(id)){
            Admin  clase = repository.findById(id).get();
            output = clase.toString();
            return output;
        }else{
            return "No se encuentra";
        }
    }
public List<Admin> getAllAdmins() {
     return repository.findAll();
}
}
