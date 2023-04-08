package com.example.clinicaOdontologica.repository.dto;

import com.example.clinicaOdontologica.entity.Domicilio;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class PacienteDTO {
    private Long id;
    private String apellido;
    private String nombre;
    private String email;
    private int dni;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

}
