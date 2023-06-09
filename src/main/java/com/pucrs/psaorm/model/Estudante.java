package com.pucrs.psaorm.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor()
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    String nome;
    int documento;
    String endereco;

    int matricula;

    @ManyToOne
    Disciplina disciplinaMatriculado;

}
