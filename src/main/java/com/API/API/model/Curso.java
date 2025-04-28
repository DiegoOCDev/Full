package com.API.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String descripcion;
    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private int idGerente;  // Se puede usar como relación si quieres luego
}