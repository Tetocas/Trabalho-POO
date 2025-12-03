package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Local;

public interface Localrepository extends JpaRepository<Local, Long> {
}