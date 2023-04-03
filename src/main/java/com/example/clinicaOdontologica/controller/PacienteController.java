//package com.example.clinicaOdontologica.controller;
//
//import com.example.clinicaOdontologica.entity.Domicilio;
//import com.example.clinicaOdontologica.entity.Paciente;
//import com.example.clinicaOdontologica.service.PacienteService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//
//@RestController
//public class PacienteController {
//    private PacienteService pacienteService = new PacienteService();
//
//    @GetMapping("/")
//    public Paciente crearPaciente() {
//        return pacienteService.crearPaciente();
//    }
//
//    @GetMapping("paciente1")
//    public Paciente crearPaciente2() {
//        Domicilio domiciloPaciente1 = new Domicilio("Cuba", 243, "La Boca", "CABA");
//        Paciente paciente1 = new Paciente(0000002, "Gonzalez", "Juan", "juangonzalez@mail.com", 17336406, LocalDate.of(2022,4,5),domiciloPaciente1);
//
//        return paciente1;
//    }
//}
