package com.pucrs.psaorm.repository;

import com.pucrs.psaorm.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

    Estudante findByMatricula(int matricula);
}
