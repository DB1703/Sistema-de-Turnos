package com.example.clinicaOdontologica.repository.dto;

import java.time.LocalDate;

public class PacienteDTO {
    private Long id;
    private String apellido;
    private String nombre;
    private String email;
    private int dni;
    private LocalDate fechaIngreso;

    public PacienteDTO(String apellido, String nombre, String email, int dni, LocalDate fechaIngreso) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
    }
}
