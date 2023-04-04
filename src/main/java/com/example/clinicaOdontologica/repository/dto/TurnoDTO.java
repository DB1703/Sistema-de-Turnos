package com.example.clinicaOdontologica.repository.dto;

import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.entity.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TurnoDTO {
    private Long id;
    private Paciente paciente;
    private Odontologo odontologo;
    private String fecha;
    private String hora;

}
