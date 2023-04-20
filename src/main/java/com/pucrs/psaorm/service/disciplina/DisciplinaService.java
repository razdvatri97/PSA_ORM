package com.pucrs.psaorm.service.disciplina;

import com.pucrs.psaorm.model.Disciplina;
import com.pucrs.psaorm.repository.disciplina.DisciplinaRepositoryIT;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService implements DisciplinaServiceIT{

    DisciplinaRepositoryIT disciplinaRepositoryIT;

    @Override
    public Optional<Disciplina> save(Disciplina disciplina) {
        return Optional.of(disciplinaRepositoryIT.save(disciplina));
    }

    @Override
    public List<Disciplina> findAll() { return disciplinaRepositoryIT.findAll(); }

    @Override
    public Optional<Disciplina> findDisciplinaByCodigoDisciplina(int codigoDisciplina) {
        return Optional.ofNullable(disciplinaRepositoryIT.findDisciplinaByCodigoDisciplina(codigoDisciplina));

    }

    @Override
    public String deleteByCodigoDisciplina(int codigoDisciplina) {
        disciplinaRepositoryIT.delete(disciplinaRepositoryIT.findDisciplinaByCodigoDisciplina(codigoDisciplina));
        return "Disciplina excluída: "+codigoDisciplina;
    }
}
