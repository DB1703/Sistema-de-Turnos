package com.example.clinicaOdontologica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Domicilios")
public class Domicilio {

    @Id
    @SequenceGenerator(name = "domicilio_sequence", sequenceName = "domicilio_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "domicilio_sequence")
    private Long id;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;
    //@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    //@JoinColumn(name = "paciente_id")
    @OneToOne(mappedBy = "domicilio")
    @JsonIgnore
    private Paciente paciente;
}
