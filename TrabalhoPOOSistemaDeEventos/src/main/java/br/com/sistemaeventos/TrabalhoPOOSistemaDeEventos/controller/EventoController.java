package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Evento;
import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository.Eventorepository;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private Eventorepository repository;

    @Operation(summary = "Lista todos os eventos")
    @GetMapping
    public List<Evento> listar() {
        return repository.findAll();
    }

    @Operation(summary = "Cria um novo evento")
    @PostMapping
    public Evento criar(@RequestBody Evento evento) {
        return repository.save(evento);
    }
}