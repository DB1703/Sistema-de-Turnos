package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.IDomicilioRepository;
import com.example.clinicaOdontologica.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService implements IDomicilioService{
    @Autowired
    private final IDomicilioRepository domicilioRepository;


    @Override
    public Domicilio guardarDomicilio() {
        return null;
    }

    @Override
    public Domicilio eliminar(Long id) {
        return null;
    }

    @Override
    public Domicilio buscar(Long id) {
        return null;
    }

    @Override
    public List<Domicilio> buscarTodosDomicilios() {
        return null;
    }
}
