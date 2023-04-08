package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OdontologoServiceTest {
    private static final Logger logger = Logger.getLogger(OdontologoServiceTest.class);

    @Autowired
    IOdontologoService odontologoService;

    @Test
    void crearOdontologo() {
        OdontologoDTO odontologoTest = new OdontologoDTO();

        odontologoTest.setApellido("Apellido Test Odontologo");
        odontologoTest.setNombre("Nombre Test Odontologo");
        odontologoTest.setMatricula(1234L);

        odontologoService.crearOdontologo(odontologoTest);

        logger.info("Odontologo creado");

    }

    @Test
    void leerOdontologo() {
        //ID del odontologo creado arriba, este es ficticio
        odontologoService.leerOdontologo(3L);

        logger.info("Aca esta el elegido");

    }

    @Test
    void eliminarOdontologo() {
        //ID del odontologo creado arriba, este es ficticio
        odontologoService.eliminarOdontologo(3L);

        logger.info("Aca esta el elegido");
    }

    @Test
    void todosLosOdontologos() {
        odontologoService.TodosLosOdontologos();

        logger.info("Todos los odontologos");
    }
}