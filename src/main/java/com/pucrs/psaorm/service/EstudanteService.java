package com.pucrs.psaorm.service;

import com.pucrs.psaorm.model.Estudante;
import com.pucrs.psaorm.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService implements EstudanteServiceIT{

    //@Autowired
    private EstudanteRepository estudanteRepository;

    @Override
    public Optional<Estudante> save(Estudante estudante) {
        return Optional.of(estudanteRepository.save(estudante));
    }

    @Override
    public List<Estudante> findAll() {
        return estudanteRepository.findAll();
    }

    @Override
    public Optional<Estudante> findByMatricula(int matricula) {
        return Optional.ofNullable(estudanteRepository.findByMatricula(matricula));
    }

    @Override
    public String deleteByMatricula(int matricula) {
        estudanteRepository.delete(estudanteRepository.findByMatricula(matricula));
        return "Aluno excluído";
    }
}
