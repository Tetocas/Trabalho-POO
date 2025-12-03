package br.com.sistemaeventos.TrabalhoPOOSistemaDeEventos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDateTime dataEvento;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @JsonIgnore
    @OneToMany(mappedBy = "evento") // Relacionamento com Participante
    private List<Participante> participantes;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDateTime getDataEvento() { return dataEvento; }
    public void setDataEvento(LocalDateTime dataEvento) { this.dataEvento = dataEvento; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Local getLocal() { return local; }
    public void setLocal(Local local) { this.local = local; }
}