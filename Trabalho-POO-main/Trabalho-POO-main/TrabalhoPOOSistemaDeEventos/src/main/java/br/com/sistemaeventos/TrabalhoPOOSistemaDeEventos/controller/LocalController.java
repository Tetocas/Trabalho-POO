package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Local;
import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository.Localrepository;

import java.util.List; 

@RestController
@RequestMapping("/api/locais")
public class LocalController {

    @Autowired
    private Localrepository repository;

    @Operation(summary = "Lista todos os locais")
    @GetMapping
    public List<Local> listar() {
        return repository.findAll();
    }

    @Operation(summary = "Cria um novo local")
    @PostMapping
    public Local criar(@RequestBody Local local) {
        return repository.save(local);
    }
    
    @Operation(summary = "Deleta um participante pelo ID")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}