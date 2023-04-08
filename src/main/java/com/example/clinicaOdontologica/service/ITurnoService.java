package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Turno;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;

import java.util.List;
import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);

    TurnoDTO leerTurno(Long id);

    void eliminarTurno(Long id);

    Set<TurnoDTO> TodosLosTurnos();

    void setOdontologoExistente(Long idOdontologo, TurnoDTO turnoDTO);

    void setPacienteExistente(Long idPaciente, TurnoDTO turnoDTO);


}
