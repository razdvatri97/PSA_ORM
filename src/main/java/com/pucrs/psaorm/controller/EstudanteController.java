package com.pucrs.psaorm.controller;

import com.pucrs.psaorm.model.Estudante;
import com.pucrs.psaorm.service.estudante.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/escola")
public class EstudanteController {
    //https://medium.com/@kswillian/desenvolvendo-uma-rest-api-com-spring-boot-postgresql-parte-1-61bf0d864965
    //@GetMapping(value = "/")
    //public String home() {        return "Olá, para acessar o swagger: http://localhost:8080/swagger-ui.html";    }
    @Autowired
    EstudanteService estudanteService;

    @GetMapping(value = "/estudantes")
    public ResponseEntity<List<Estudante>> findAll() {
        return ResponseEntity.status(OK).body(estudanteService.findAll());
    }

    @GetMapping(value = "/estudantes/{matricula}")
    public ResponseEntity<Optional<Estudante>> findByMatricula(@PathVariable int matricula) {
        return ResponseEntity.status(OK).body(estudanteService.findEstudanteByMatricula(matricula));
    }

    @PostMapping(value = "/estudantes/criar")
    public ResponseEntity<Optional<Estudante>> criar(@RequestParam(value = "nome") String nome,
                                                     @RequestParam(value = "documento") int documento,
                                                     @RequestParam(value = "endereco") String endereco) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(estudanteService.save(Estudante.builder()
                        .nome(nome)
                        .documento(documento)
                        .endereco(endereco)
                        .build()));
    }

    @DeleteMapping(value = "/estudantes/deletar/{matricula}")
    public ResponseEntity<String> deletar(@PathVariable int matricula) {
        return ResponseEntity.status(OK).body(estudanteService.deleteByMatricula(matricula));
    }
}
