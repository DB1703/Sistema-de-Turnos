package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;
import com.example.clinicaOdontologica.service.IDomicilioService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DomicilioServiceTest {
    private static final Logger logger = Logger.getLogger(DomicilioServiceTest.class);

    @Autowired
    IDomicilioService domicilioService;

    @Test
    void crearDomicilio() {
        DomicilioDTO domicilioTest = new DomicilioDTO();

        domicilioTest.setCalle("Test Calle Domicilio");
        domicilioTest.setLocalidad("Test Localidad Domicilio");
        domicilioTest.setNumero(1234);

        domicilioService.crearDomicilio(domicilioTest);

        logger.info("Domicilio Creado!");
    }

    @Test
    void leerDomicilio() {
        //ID del domicilio creado arriba, este es ficticio
        domicilioService.leerDomicilio(3L);

        logger.info("Acá está el elegido");
    }

    @Test
    void eliminarDomicilio() {
        //ID del domiclio creado arriba, este es ficticio
        domicilioService.eliminarDomicilio(3L);

        logger.info("Domicilio eliminado");
    }

    @Test
    void todosLosDomicilios() {
        domicilioService.TodosLosDomicilios();

        logger.info("Todos los domicilios");
    }
}