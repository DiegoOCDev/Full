package com.API.API.service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.API.API.model.Reporte;
import com.API.API.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {
    @Autowired
    private ReporteRepository reporteRepository;
    public Reporte addReporte(Reporte reporte) {
        return reporteRepository.AddReporte(reporte);
    }
    public Reporte getReporte(int id) {
        return reporteRepository.GetReporte(id);
    }
    public String updateReporte(Reporte reporte, int id) {
        return reporteRepository.UpdateReporte(id,reporte);
    }
    public String deleteReporte(int id) {
        return reporteRepository.DeleteReporte(id);
    }
    public List<Reporte> getReportes() {
        return reporteRepository.GetReportes();
    }
}
