package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;

import java.util.List;

public interface IDomicilioService {
    public Domicilio guardarDomicilio(DomicilioDTO domicilioDTO);

    public Domicilio eliminar(Long id);

    public Domicilio buscar(Long id);

    public List<Domicilio> buscarTodosDomicilios();

}
