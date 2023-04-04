package com.example.clinicaOdontologica.controller;


import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    IPacienteService pacienteService;

    @PostMapping
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO leerPaciente(@PathVariable Long id){
        return pacienteService.leerPaciente(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("listaPacientes")
    public Collection<PacienteDTO> todosLosPacientes(){
        return pacienteService.TodosLosPacientes();
    }
}
