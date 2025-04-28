package com.API.API.repository;
import java.util.List;
import java.util.ArrayList;

import com.API.API.model.Reporte;
import org.springframework.stereotype.Repository;
@Repository
public class ReporteRepository {
    private List<Reporte> reportes = new ArrayList<>();
    public ReporteRepository(){
    }
    public Reporte AddReporte(Reporte reporte){
        reportes.add(reporte);
        return reporte;

    }
    public List<Reporte> GetReportes() {
        return reportes;
    }
    public Reporte GetReporte(int id) {
        for (Reporte reporte : reportes) {
            if (reporte.getId() == id) {
                return reporte;
            }
        }
        return null;
    }
    public String UpdateReporte(int id, Reporte reporte) {
        int index = 0;
        for (Reporte reporte1 : reportes) {
            if (reporte1.getId() == id) {
                index = reportes.indexOf(reporte1);
                reportes.set(index, reporte);
                return "Report updated";
            }
        }
        return "Report not found";
    }
    public String DeleteReporte(int id) {
        int index = 0;
        for (Reporte reporte : reportes) {
            if (reporte.getId() == id) {
                index = reportes.indexOf(reporte);
                reportes.remove(index);
                return "Report deleted";
            }
        }
        return "Report not found";
    }
}
