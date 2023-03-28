package com.example.clinicaOdontologica.service;

import com.example.clinicaOdontologica.entity.Paciente;

import java.util.List;

public interface IPacienteService {
    public Paciente guardarPaciente();

    public Paciente eliminarPaciente(Long id);

    public Paciente buscarPaciente(Long id);

    public List<Paciente> buscarTodosPacientes();

}
