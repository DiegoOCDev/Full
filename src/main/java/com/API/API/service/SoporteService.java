package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Soporte;
import com.API.API.repository.SoporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoporteService {
@Autowired
    private SoporteRepository soporteRepository;
public Soporte addSoporte(Soporte soporte) {
    return  soporteRepository.AddSoporte(soporte);
}
public String deleteSoporte(int id) {
    return soporteRepository.DeleteSoporte(id);
}
public String updateSoporte(Soporte soporte,int id) {
    return soporteRepository.UpdateSoporte(id, soporte);
}
public Soporte getSoporte(int id) {
    return soporteRepository.GetSoporte(id);
}
public List<Soporte> getSoportes() {
    return soporteRepository.getSoportes();
}
}
