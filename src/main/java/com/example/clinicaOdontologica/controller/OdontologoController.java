package com.example.clinicaOdontologica.controller;

import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import com.example.clinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/nuevoOdontologo")
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO leerOdontologo(@PathVariable Long id){
        return odontologoService.leerOdontologo(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("listaOdontologos")
    public Collection<OdontologoDTO> todosLosOdontologos(){
        return odontologoService.TodosLosOdontologos();
    }
}
