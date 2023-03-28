package com.example.clinicaOdontologica.repository.dto;

public class OdontologoDTO {
    private String nombre;
    private String apellido;
    private Long id;
    private Long matricula;

    public OdontologoDTO(String nombre, String apellido, Long matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }
}
