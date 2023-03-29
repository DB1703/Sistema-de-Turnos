package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;

import java.util.List;

public interface IPacienteService {
    public Paciente guardarPaciente(PacienteDTO pacienteDTO);

    public Paciente eliminarPaciente(Long id);

    public Paciente buscarPaciente(Long id);

    public List<Paciente> listarTodosPacientes();

}
