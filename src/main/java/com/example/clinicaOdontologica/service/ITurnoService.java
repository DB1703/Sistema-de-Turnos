package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Turno;

import java.util.List;

public interface ITurnoService {
    public Turno guardarTurno();

    public Turno eliminarTurno(Long id);

    public Turno buscarTurno(Long id);

    public List<Turno> buscarTodosTurnos();
}
