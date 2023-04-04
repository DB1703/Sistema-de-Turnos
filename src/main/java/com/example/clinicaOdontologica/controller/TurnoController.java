package com.example.clinicaOdontologica.controller;

import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.repository.dto.TurnoDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import com.example.clinicaOdontologica.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    ITurnoService turnoService;

    @PostMapping("/nuevoTurno")
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO leerTurno(@PathVariable Long id){
        return turnoService.leerTurno(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("listaTurnos")
    public Collection<TurnoDTO> todosLosTurnos(){
        return turnoService.TodosLosTurnos();
    }
}
