package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Admin;
import org.springframework.stereotype.Repository;
@Repository


public class AdminRepository {
    private List<Admin> admins;
    public AdminRepository() {}
    //CRUD
    public String AddAdmin(Admin Admin ){

        admins.add(Admin);
        return "Admin added";
    }
    public String RemoveAdmin(int id){
        for(Admin Admin : admins){
            if(Admin.getId() == id){
                admins.remove(Admin);
                return "Admin removed";
            }
        }
        return "Admin not found";
    }
    public String UpdateAdmin(int id,Admin Admin){
        int index = 0;
        for(Admin a : admins){
            if(a.getId()==id){
                index = admins.indexOf(a);
                admins.set(index, Admin);
                return "Admin updated";

            }
        }
        return "Admin Not Found";


    }
    public List<Admin> GetAdmins() {
        return admins;
    }
    public void SetAdmins(List<Admin> admins) {
        this.admins = admins;
    }
    public Admin GetAdmin(int id){
        for (Admin Admin : admins) {
            if(Admin.getId() == id){
                return Admin;
            }
        }
        return null;
    }
    public String DeleteAdmin(int id){
        int index = 0;
        for(Admin Admin : admins){
            if(Admin.getId() == id){
                index = admins.indexOf(Admin);
                admins.remove(index);
                return "Admin deleted";
            }
        }
                return "Admin not found";
    }


}
