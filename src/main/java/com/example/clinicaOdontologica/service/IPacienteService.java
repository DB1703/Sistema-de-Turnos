package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;

import java.util.List;

public interface IPacienteService {
    public void guardarPaciente(PacienteDTO pacienteDTO);

    public void eliminarPaciente(Long id);

    public void buscarPaciente(Long id);

    public void listarTodosPacientes();

}
