package com.example.APIADMINMATERIAS.application.services;

import com.example.APIADMINMATERIAS.domain.models.Subject;
import com.example.APIADMINMATERIAS.domain.ports.ISubjectRepository;

import java.util.Optional;
import java.util.UUID;

public class DomainSubjectServiceImpl implements ISubjectService{
    private final ISubjectRepository repository;

    public DomainSubjectServiceImpl(ISubjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Subject create(Subject subject) {
        return repository.create(subject);
    }

    @Override
    public void delete(UUID id) {
       repository.delete(id);
    }

    @Override
    public Iterable<Subject> list() {
        return repository.list();
    }

    @Override
    public Optional<Subject> get(UUID id) {
        return repository.get(id);
    }
}
