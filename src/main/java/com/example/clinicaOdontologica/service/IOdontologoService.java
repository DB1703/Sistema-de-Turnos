package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;

import java.util.List;
import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDTO odontologoDTO);

    OdontologoDTO leerOdontologo(Long id);

    void eliminarOdontologo(Long id);

    Set<OdontologoDTO> TodosLosOdontologos();

}
