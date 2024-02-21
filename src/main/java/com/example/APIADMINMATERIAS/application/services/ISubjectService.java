package com.example.APIADMINMATERIAS.application.services;

import com.example.APIADMINMATERIAS.domain.models.Subject;

import java.util.Optional;
import java.util.UUID;

public interface ISubjectService {
    Subject create(Subject subject);
    void delete(UUID id);
    Iterable<Subject> list();
    Optional<Subject> get(UUID id);
}
