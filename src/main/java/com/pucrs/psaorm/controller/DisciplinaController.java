package com.pucrs.psaorm.controller;

import com.pucrs.psaorm.model.Disciplina;
import com.pucrs.psaorm.service.disciplina.DisciplinaService;
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
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @GetMapping(value= "/disciplinas")
    public ResponseEntity<List<Disciplina>> findAll(){
        return ResponseEntity.status(OK).body(disciplinaService.findAll());
    }

    @GetMapping(value = "/disciplinas/{codigoDisciplina}")
    public ResponseEntity<Optional<Disciplina>> findByCodigoDisciplina(@PathVariable int codigoDisciplina){
        return ResponseEntity.status(OK).body(disciplinaService.findDisciplinaByCodigoDisciplina(codigoDisciplina));
    }

   /* @PostMapping(value = "/disciplinas/criar")
    public ResponseEntity<List<Disciplina>> criar(@RequestParam int codigoDisciplina
    @RequestParam String){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(disciplinaService.save(Disciplina.builder()
                        .codigoDisciplina(codigoDisciplina).build()))
    } */

}
