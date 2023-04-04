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
    public void crearPaciente() {
        PacienteDTO merePaciente = new PacienteDTO();

        merePaciente.setNombre("Mere");
        merePaciente.setApellido("Mera");
        merePaciente.setDni(44895904);
        merePaciente.setEmail("martin@mail.com");
        merePaciente.setFechaIngreso(LocalDate.of(2003,8,17));

        pacienteService.crearPaciente(merePaciente);



        assertNotNull(merePaciente);


    }

    @Test
    public void borrarPaciente(){
        pacienteService.eliminarPaciente(1L);
        pacienteService.eliminarPaciente(2L);

    }
}
