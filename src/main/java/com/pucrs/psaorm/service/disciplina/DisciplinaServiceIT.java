package com.pucrs.psaorm.service.disciplina;

import com.pucrs.psaorm.model.Disciplina;

import java.util.List;
import java.util.Optional;

public interface DisciplinaServiceIT {

    Optional<Disciplina> save(Disciplina disciplina);

    List<Disciplina> findAll();

    Optional<Disciplina> findDisciplinaByCodigoDisciplina(int codigoDisciplina);

    String deleteByCodigoDisciplina(int codigoDisciplina);
}
