package com.example.APIADMINMATERIAS.application.services;

import com.example.APIADMINMATERIAS.domain.models.Topic;

import java.util.Optional;
import java.util.UUID;

public interface ITopicService {
    Topic create(Topic topic);
    Iterable<Topic> list();
    Optional<Topic> get(UUID id);
    void delete(UUID id);
}
