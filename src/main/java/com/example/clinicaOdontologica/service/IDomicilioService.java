package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;

import java.util.List;
import java.util.Set;

public interface IDomicilioService {
    void crearDomicilio(DomicilioDTO domicilioDTO);

    DomicilioDTO leerDomicilio(Long id);

    void eliminarDomicilio(Long id);

    Set<DomicilioDTO> TodosLosDomicilios();

}
