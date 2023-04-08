package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.entity.Paciente;
import com.example.clinicaOdontologica.repository.IOdontologoRepository;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.repository.dto.PacienteDTO;
import com.example.clinicaOdontologica.service.IOdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@Service
public class OdontologoService implements IOdontologoService {
    private static final Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);

        logger.info("Odontologo creado");
    }

    @Override
    public OdontologoDTO leerOdontologo(Long id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        if (odontologo.isPresent())
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        logger.info("Odontologo encontrado");
        return odontologoDTO;
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
        logger.info("Odontologo eliminado");
    }

    @Override
    public Set<OdontologoDTO> TodosLosOdontologos() {
        List<Odontologo> odontologos = odontologoRepository.findAll();

        Set<OdontologoDTO> odontologosDTO = new HashSet<>();

        for (Odontologo odontologo: odontologos) {
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        logger.info("Todos los odontologos presentes");
        return odontologosDTO;
    }
}
