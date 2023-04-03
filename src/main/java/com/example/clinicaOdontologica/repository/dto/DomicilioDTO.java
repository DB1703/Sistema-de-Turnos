package com.example.clinicaOdontologica.repository.dto;

import com.example.clinicaOdontologica.entity.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomicilioDTO {
    private Long id;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;
    private Paciente paciente;

    public DomicilioDTO(String calle, int numero, String localidad, String provincia, Paciente paciente) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
        this.paciente = paciente;
    }
}
