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
        PacienteDTO pacienteTestTurno = new PacienteDTO();
        Domicilio domicilioTestTurno = new Domicilio();
        OdontologoDTO odontologoTestTurno = new OdontologoDTO();

        //Creacion de paciente

        pacienteTestTurno.setNombre("Prueba Turno Nombre Paciente");
        pacienteTestTurno.setApellido("test turno paciente Apellido");
        pacienteTestTurno.setEmail("Test turno paciente email");
        pacienteTestTurno.setDni(7654321);
        pacienteTestTurno.setFechaIngreso(LocalDate.of(1968,4,30));
        domicilioTestTurno.setLocalidad("Test turno domicilio localidad");
        domicilioTestTurno.setProvincia("Test turno domicilio provincia");
        domicilioTestTurno.setCalle("Test turno calle domicilio calle");
        domicilioTestTurno.setNumero(5600);
        pacienteTestTurno.setDomicilio(domicilioTestTurno);

        pacienteService.crearPaciente(pacienteTestTurno);

        logger.info("Paciente creado");

        //Creación de odontologo

        odontologoTestTurno.setNombre("Test turno odontologo nombre");
        odontologoTestTurno.setApellido("Test turno odontologo apellido");
        odontologoTestTurno.setMatricula(1015L);

        odontologoService.crearOdontologo(odontologoTestTurno);

        logger.info("Odontologo creado");

        //Creacion Turno

        logger.info("Seteando Turno");

        turnoTestTurno.setFecha("2023-12-12");
        turnoTestTurno.setHora("16:15");
        //Comentado lo de abajo porque no logré resolver como tendria que llamar desde aca el odontologo y paciente de arriba

        //turnoTestTurno.setOdontologo(odontologoTestTurno);
        //turnoTestTurno.setPaciente(pacienteTestTurno);


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