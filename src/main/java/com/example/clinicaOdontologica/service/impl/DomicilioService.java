package com.example.clinicaOdontologica.service.impl;

import com.example.clinicaOdontologica.ClinicaOdontologicaApplication;
import com.example.clinicaOdontologica.entity.Domicilio;
import com.example.clinicaOdontologica.entity.Odontologo;
import com.example.clinicaOdontologica.repository.IDomicilioRepository;
import com.example.clinicaOdontologica.repository.dto.DomicilioDTO;
import com.example.clinicaOdontologica.repository.dto.OdontologoDTO;
import com.example.clinicaOdontologica.service.IDomicilioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService{
    private static final Logger logger = Logger.getLogger(DomicilioService.class);
    @Autowired
    private IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO,Domicilio.class);
        domicilioRepository.save(domicilio);

        logger.info("Domicilio creado");
    }

    @Override
    public DomicilioDTO leerDomicilio(Long id) {
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        DomicilioDTO domicilioDTO = null;
        if (domicilio.isPresent())
            domicilioDTO = mapper.convertValue(domicilio, DomicilioDTO.class);
        logger.info("Domicilio encontrado");
        return domicilioDTO;
    }

    @Override
    public void eliminarDomicilio(Long id) {
        domicilioRepository.deleteById(id);
        logger.info("Domicilio eliminado");
    }

    @Override
    public Set<DomicilioDTO> TodosLosDomicilios() {
        List<Domicilio> domicilios = domicilioRepository.findAll();

        Set<DomicilioDTO> domiciliosDTO = new HashSet<>();

        for (Domicilio domicilio: domicilios) {
            domiciliosDTO.add(mapper.convertValue(domicilio, DomicilioDTO.class));
        }
        logger.info("Todos los domicilios presentes");
        return domiciliosDTO;
    }
}

