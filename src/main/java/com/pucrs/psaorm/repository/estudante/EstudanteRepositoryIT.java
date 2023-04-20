package com.pucrs.psaorm.repository.estudante;

import com.pucrs.psaorm.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepositoryIT extends JpaRepository<Estudante, Integer> {

    Estudante findEstudanteByMatricula(int matricula);
}
