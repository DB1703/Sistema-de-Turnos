package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;


import java.util.Set;

public interface IPacienteService {
    void crearPaciente(PacienteDTO pacienteDTO);

    PacienteDTO leerPaciente(Long id);

    void eliminarPaciente(Long id);

    Set<PacienteDTO> TodosLosPacientes();

}
