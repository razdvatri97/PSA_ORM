package com.pucrs.psaorm.service.estudante;

import com.pucrs.psaorm.model.Estudante;
import com.pucrs.psaorm.repository.estudante.EstudanteRepositoryIT;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService implements EstudanteServiceIT{

    //@Autowired
    private EstudanteRepositoryIT estudanteRepositoryIT;

    @Override
    public Optional<Estudante> save(Estudante estudante) {
        return Optional.of(estudanteRepositoryIT.save(estudante));
    }

    @Override
    public List<Estudante> findAll() {
        return estudanteRepositoryIT.findAll();
    }

    @Override
    public Optional<Estudante> findEstudanteByMatricula(int matricula) {
        return Optional.ofNullable(estudanteRepositoryIT.findEstudanteByMatricula(matricula));
    }

    @Override
    public String deleteByMatricula(int matricula) {
        estudanteRepositoryIT.delete(estudanteRepositoryIT.findEstudanteByMatricula(matricula));
        return "Aluno excluído: "+matricula;
    }
}
