package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    IOdontologoService odontologoService;

    @Test
    void crearOdontologo() {
        OdontologoDTO odontologoTest = new OdontologoDTO();

        odontologoTest.setApellido("Apellido Test Odontologo");
        odontologoTest.setNombre("Nombre Test Odontologo");
        odontologoTest.setMatricula(1234L);

        odontologoService.crearOdontologo(odontologoTest);

    }

    @Test
    void leerOdontologo() {
        //ID del odontologo creado arriba, este es ficticio
        odontologoService.leerOdontologo(3L);

    }

    @Test
    void eliminarOdontologo() {
        //ID del odontologo creado arriba, este es ficticio
        odontologoService.eliminarOdontologo(3L);
    }

    @Test
    void todosLosOdontologos() {
        odontologoService.TodosLosOdontologos();
    }
}