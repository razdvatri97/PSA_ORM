package com.pucrs.psaorm.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor()
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    int codigoDisciplina;
    String nome;
    String horario;
    int turma;

    @OneToMany
    List<Estudante> estudanteMatriculados;


}
