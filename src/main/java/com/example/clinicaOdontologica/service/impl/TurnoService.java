package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.entity.Turno;
import com.example.clinicaOdontologica.repository.ITurnoRepository;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;
import com.example.clinicaOdontologica.service.ITurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class TurnoService implements ITurnoService {

    private static final Logger logger = Logger.getLogger(TurnoService.class);

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    PacienteService pacienteService;

    @Autowired
    OdontologoService odontologoService;

    @Override
    public void crearTurno(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);

        logger.info("Turno creado!");
    }

    @Override
    public TurnoDTO leerTurno(Long id) {
        Optional<Turno> turno = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if (turno.isPresent())
            turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
        logger.info("Turno Encontrado!");
        return turnoDTO;

    }

    @Override
    public void eliminarTurno(Long id) {
        turnoRepository.deleteById(id);
        logger.info("Turno eliminado!");
    }

    @Override
    public Set<TurnoDTO> TodosLosTurnos() {
        List<Turno> turnos = turnoRepository.findAll();

        Set<TurnoDTO> turnosDTO = new HashSet<>();

        for (Turno turno: turnos) {
            turnosDTO.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        logger.info("Todos los Turnos");
        return turnosDTO;
    }

    @Override
    public void setOdontologoExistente(Long idOdontologo, TurnoDTO turnoDTO) {
        Odontologo odontologoMappeado = mapper.convertValue(odontologoService.leerOdontologo(idOdontologo), Odontologo.class);
        turnoDTO.setOdontologo(odontologoMappeado);
    }

    @Override
    public void setPacienteExistente(Long idPaciente, TurnoDTO turnoDTO) {
        Paciente pacienteMappeado = mapper.convertValue(pacienteService.leerPaciente(idPaciente), Paciente.class);
        turnoDTO.setPaciente(pacienteMappeado);
    }


}
