package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;

import java.util.List;

public interface IOdontologoService {
    public Odontologo guardarOdontologo(OdontologoDTO odontologoDTO);

    public Odontologo eliminarOdontologo(Long id);

    public Odontologo buscarOdontologo(Long id);

    public List<Odontologo> ListarTodosOdontologos();

}
