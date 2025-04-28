package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Admin;
import com.API.API.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {
 @Autowired
    private AdminRepository adminRepository;
 public Admin addAdmin(Admin admin) {
     return adminRepository.AddAdmin(admin);
 }
 public String deleteAdmin(int id) {
     return adminRepository.DeleteAdmin(id);
 }
 public String updateAdmin(int id,Admin admin) {
     return adminRepository.UpdateAdmin(id, admin);

 }
 public Admin getAdmin(int id) {
     return adminRepository.GetAdmin(id);
 }
public List<Admin> getAllAdmins() {
     return adminRepository.GetAdmins();
}
}
