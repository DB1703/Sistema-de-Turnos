package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;

import java.util.List;

public interface IDomicilioService {
    public void guardarDomicilio(DomicilioDTO domicilioDTO);

    public void eliminar(Long id);

    public void buscar(Long id);

    public void buscarTodosDomicilios();

}
