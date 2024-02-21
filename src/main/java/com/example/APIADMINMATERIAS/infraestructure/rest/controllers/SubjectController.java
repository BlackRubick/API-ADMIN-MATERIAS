package com.example.APIADMINMATERIAS.infraestructure.rest.controllers;

import com.example.APIADMINMATERIAS.application.services.ISubjectService;
import com.example.APIADMINMATERIAS.domain.models.Subject;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@RestController
@RequestMapping("/api/subject")
@Slf4j
public class SubjectController {
    private final ISubjectService service;

    public SubjectController(ISubjectService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Subject> create(@RequestBody Subject subject){
        return new ResponseEntity<>(service.create(subject), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Subject>> list(){
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getProduct (@PathVariable UUID id){
        return new ResponseEntity<>(service.get(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        service.delete(id);
    }
}
