package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Participante;
import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository.Participanterepository;

import java.util.List;

@RestController
@RequestMapping("/api/participantes")
public class ParticipanteController {

    @Autowired
    private Participanterepository repository;

    @Operation(summary = "Lista todos os participantes")
    @GetMapping
    public List<Participante> listar() {
        return repository.findAll();
    }

    @Operation(summary = "Cria um novo participante")
    @PostMapping
    public Participante criar(@RequestBody Participante participante) {
        return repository.save(participante);
    }
}