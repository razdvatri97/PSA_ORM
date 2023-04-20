package com.pucrs.psaorm.repository.disciplina;

import com.pucrs.psaorm.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepositoryIT extends JpaRepository<Disciplina, Integer> {
    Disciplina findDisciplinaByCodigoDisciplina(int codigoDisciplina);
}
