package com.example.APIADMINMATERIAS.infraestructure.rest.controllers;

import com.example.APIADMINMATERIAS.application.services.ITopicService;
import com.example.APIADMINMATERIAS.domain.models.Topic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/topic")
@Slf4j
public class TopicController {
    private final ITopicService service;

    public TopicController(ITopicService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Topic> create(@RequestBody Topic topic){
        return new ResponseEntity<>(service.create(topic), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Topic>> list(){
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topic> get(@PathVariable UUID id){
        return new ResponseEntity<>(service.get(id).get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        service.delete(id);
    }
}
