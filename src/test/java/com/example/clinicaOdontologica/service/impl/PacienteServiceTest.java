package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IPacienteService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PacienteServiceTest {

    private static final Logger logger = Logger.getLogger(PacienteServiceTest.class);
    @Autowired
    IPacienteService pacienteService;

    @Test
    public void crearPaciente() {
        PacienteDTO PacienteTest = new PacienteDTO();
        Domicilio domicilioTest = new Domicilio();

        PacienteTest.setNombre("Esto es una prueba");
        PacienteTest.setApellido("Test de creacion de paciente");
        PacienteTest.setDni(44895904);
        PacienteTest.setEmail("martin@mail.com");
        PacienteTest.setFechaIngreso(LocalDate.of(1998,3,10));
        domicilioTest.setCalle("Calle prueba");
        domicilioTest.setNumero(4356);
        domicilioTest.setProvincia("Provincia de prueba");
        domicilioTest.setLocalidad("Localidad de prueba");
        PacienteTest.setDomicilio(domicilioTest);


        pacienteService.crearPaciente(PacienteTest);
        logger.info("Paciente creado!");

        assertNotNull(PacienteTest);

    }
    @Test
    public void leerPaciente(){
        //ID del paciente creado arriba, este es ficticio
        pacienteService.leerPaciente(31L);
        logger.info("Lo encontré!");
    }

    @Test
    public void TodosLosPacientes(){
        pacienteService.TodosLosPacientes();
        logger.info("Acá están todos");
    }

    @Test
    public void eliminarPaciente(){
        //ID del paciente creado arriba, este es ficticio
        pacienteService.eliminarPaciente(31L);
        logger.info("Eliminado");

    }


}
