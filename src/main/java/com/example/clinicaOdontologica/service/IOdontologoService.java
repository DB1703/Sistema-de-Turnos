package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    public Odontologo guardarOdontologo();

    public Odontologo eliminarOdontologo(Long id);

    public Odontologo buscarOdontologo(Long id);

    public List<Odontologo> buscarTodosOdontologos();

}
