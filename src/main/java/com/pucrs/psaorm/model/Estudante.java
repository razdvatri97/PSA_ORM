package com.pucrs.psaorm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    String nome;
    int documento;
    String endereco;

    int matricula;

    public Estudante() {

    }
}
