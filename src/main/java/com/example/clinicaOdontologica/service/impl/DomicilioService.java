package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.IDomicilioRepository;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;
import com.example.clinicaOdontologica.service.IDomicilioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService implements IDomicilioService{
    @Autowired
    private IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void guardarDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = objectMapper.convertValue(domicilioDTO,Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public void eliminar(Long id) {
        domicilioRepository.delete(id);
    }

    @Override
    public void buscar(Long id) {

    }

    @Override
    public void buscarTodosDomicilios() {

    }
}
