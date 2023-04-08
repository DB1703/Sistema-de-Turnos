package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.entity.Turno;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import com.example.clinicaOdontologica.service.IPacienteService;
import com.example.clinicaOdontologica.service.ITurnoService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TurnoServiceTest {
    private static final Logger logger = Logger.getLogger(TurnoServiceTest.class);

    @Autowired
    ITurnoService turnoService;

    @Autowired
    IPacienteService pacienteService;

    @Autowired
    IOdontologoService odontologoService;

    @Test
    void crearTurno() {
        TurnoDTO turnoTestTurno = new TurnoDTO();
        //Creacion Turno

        logger.info("Seteando Turno");

        turnoService.setPacienteExistente(100L,turnoTestTurno);
        turnoService.setOdontologoExistente(100L,turnoTestTurno);
        turnoTestTurno.setFecha("2023-12-12");
        turnoTestTurno.setHora("16:15");
        turnoService.crearTurno(turnoTestTurno);

        TurnoDTO turnoDTO = turnoService.leerTurno(1L);
        assertEquals(1L,turnoDTO.getId());

    }

    @Test
    void leerTurno() {
        //ID del turno creado arriba, este es ficticio

        turnoService.leerTurno(3L);

        logger.info("Aca estas");
    }

    @Test
    void eliminarTurno() {
        //ID del turno creado arriba, este es ficticio

        turnoService.eliminarTurno(3L);

        logger.info("Turno eliminado");
    }

    @Test
    void todosLosTurnos() {
        turnoService.TodosLosTurnos();

        logger.info("Aca estan todos los turnos");
    }
}