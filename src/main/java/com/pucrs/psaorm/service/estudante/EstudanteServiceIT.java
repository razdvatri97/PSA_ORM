package com.pucrs.psaorm.service.estudante;

import com.pucrs.psaorm.model.Estudante;

import java.util.List;
import java.util.Optional;

public interface EstudanteServiceIT {

    Optional<Estudante> save(Estudante estudante);

    List<Estudante> findAll();

    Optional<Estudante> findEstudanteByMatricula(int matricula);

    String deleteByMatricula(int matricula);

}
