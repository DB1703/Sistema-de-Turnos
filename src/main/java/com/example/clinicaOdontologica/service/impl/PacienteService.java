package com.example.clinicaOdontologica.service.impl;

//import com.example.clinicaOdontologica.controller.PacienteController;
import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.repository.IPacienteRepository;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IPacienteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class PacienteService implements IPacienteService {

    private static final Logger logger = Logger.getLogger(PacienteService.class);

    @Autowired
    private IPacienteRepository pacienteRepository;
    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);

        logger.info("Paciente creado!");
    }

    @Override
    public PacienteDTO leerPaciente(Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO = null;
        if (paciente.isPresent())
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);

        logger.info("Aca esta tu paciente");
        return pacienteDTO;
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
        logger.info("Paciente eliminado");
    }

    @Override
    public Set<PacienteDTO> TodosLosPacientes() {

        List<Paciente> pacientes = pacienteRepository.findAll();

        Set<PacienteDTO> pacientesDTO = new HashSet<>();

        for (Paciente paciente: pacientes) {
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        logger.info("Todos los pacientes presentes");
        return pacientesDTO;
    }
}
