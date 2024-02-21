package com.example.APIADMINMATERIAS.domain.ports;

import com.example.APIADMINMATERIAS.domain.models.Topic;

import java.util.Optional;
import java.util.UUID;

public interface ITopicRepository {
    Topic create(Topic topic);
    Iterable<Topic> list();
    Optional<Topic> get(UUID id);
    void delete(UUID id);
}
