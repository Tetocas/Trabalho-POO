package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model.Participante;

public interface Participanterepository extends JpaRepository<Participante, Long> {
}