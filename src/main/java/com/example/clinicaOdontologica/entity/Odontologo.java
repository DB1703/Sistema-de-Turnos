package com.example.clinicaOdontologica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
