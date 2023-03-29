package com.example.clinicaOdontologica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table

public class Odontologo {
    @Id
    @SequenceGenerator(name = "odontologo_sequence", sequenceName = "odontologo_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "odontologo_sequence")

    private String nombre;
    private String apellido;
    private Long id;
    private Long matricula;
    @OneToMany(mappedBy = "odontologos")
    @JsonIgnore
    private Set<Turno> turnos;
    public Odontologo() {
    }

    public Odontologo(String nombre, String apellido, Long matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
}
