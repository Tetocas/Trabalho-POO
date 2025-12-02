package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Evento;

public interface Eventorepository extends JpaRepository<Evento, Long> {
}