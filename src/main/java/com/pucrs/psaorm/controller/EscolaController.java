package com.pucrs.psaorm.controller;

import com.pucrs.psaorm.model.Estudante;
import com.pucrs.psaorm.service.EstudanteService;
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
public class EscolaController {
    //https://medium.com/@kswillian/desenvolvendo-uma-rest-api-com-spring-boot-postgresql-parte-1-61bf0d864965
    //@GetMapping(value = "/")
    //public String home() {        return "Olá, para acessar o swagger: http://localhost:8080/swagger-ui.html";    }

    @GetMapping
    public ResponseEntity<List<Estudante>> findAll() {
        return ResponseEntity.status(OK).body(estudanteService.findAll());
    }

    @GetMapping(value = "/{matricula}")
    public ResponseEntity<Optional<Estudante>> findByMatricula(@PathVariable int matricula) {
        return ResponseEntity.status(OK).body(estudanteService.findByMatricula(matricula));
    }

    @PostMapping
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

    @Autowired
    EstudanteService estudanteService;


}
