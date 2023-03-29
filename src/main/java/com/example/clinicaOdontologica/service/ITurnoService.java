package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Turno;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;

import java.util.List;

public interface ITurnoService {
    public Turno guardarTurno(TurnoDTO turnoDTO);

    public Turno eliminarTurno(Long id);

    public Turno buscarTurno(Long id);

    public List<Turno> listarTodosTurnos();
}
