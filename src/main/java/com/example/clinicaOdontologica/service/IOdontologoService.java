package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;

import java.util.List;

public interface IOdontologoService {
    public void guardarOdontologo(OdontologoDTO odontologoDTO);

    public void eliminarOdontologo(Long id);

    public void buscarOdontologo(Long id);

    public void ListarTodosOdontologos();

}
