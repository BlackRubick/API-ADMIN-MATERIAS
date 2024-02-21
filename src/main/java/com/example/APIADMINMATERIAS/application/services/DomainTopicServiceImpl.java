package com.example.APIADMINMATERIAS.application.services;

import com.example.APIADMINMATERIAS.domain.models.Topic;
import com.example.APIADMINMATERIAS.domain.ports.ITopicRepository;

import java.util.Optional;
import java.util.UUID;

public class DomainTopicServiceImpl implements ITopicService{
    private final ITopicRepository repository;

    public DomainTopicServiceImpl(ITopicRepository repository) {
        this.repository = repository;
    }

    @Override
    public Topic create(Topic topic) {
        return repository.create(topic);
    }

    @Override
    public Iterable<Topic> list() {
        return repository.list();
    }

    @Override
    public Optional<Topic> get(UUID id) {
        return repository.get(id);
    }

    @Override
    public void delete(UUID id) {
        repository.delete(id);
    }
}
