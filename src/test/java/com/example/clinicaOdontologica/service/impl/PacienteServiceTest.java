package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PacienteServiceTest {
    @Autowired
    IPacienteService pacienteService;

    @Test
    public void borrarPaciente() {
        PacienteDTO pacienteDTO = new PacienteDTO("De Bernardi", "Franco", "debernardifranco@mail.com", 12345678, LocalDate.of(2003,8,17));

        pacienteService.crearPaciente(pacienteDTO);

        PacienteDTO francoPaciente = pacienteService.leerPaciente(1L);

        assertNotNull(francoPaciente);

        //pacienteService.eliminarPaciente(2L);
    }
}
