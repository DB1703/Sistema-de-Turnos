package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Turno;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;

import java.util.List;

public interface ITurnoService {
    public void guardarTurno(TurnoDTO turnoDTO);

    public void eliminarTurno(Long id);

    public void buscarTurno(Long id);

    public void listarTodosTurnos();
}
