package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Domicilio;

import java.util.List;

public interface IDomicilioService {
    public Domicilio guardarDomicilio();

    public Domicilio eliminar(Long id);

    public Domicilio buscar(Long id);

    public List<Domicilio> buscarTodosDomicilios();

}
