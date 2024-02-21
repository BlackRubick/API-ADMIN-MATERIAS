package com.example.APIADMINMATERIAS.infraestructure.adapters;

import com.example.APIADMINMATERIAS.domain.models.Topic;
import com.example.APIADMINMATERIAS.domain.ports.ITopicRepository;
import com.example.APIADMINMATERIAS.infraestructure.entities.TopicEntity;
import com.example.APIADMINMATERIAS.infraestructure.rest.mappers.TopicMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@Slf4j
public class TopicRepositoryMySql implements ITopicRepository{
    private final ITopicCrudRepositoryMySql repository;

    @Autowired
    private TopicMapper topicMapper;

    public TopicRepositoryMySql(ITopicCrudRepositoryMySql repository) {
        this.repository = repository;
    }

    @Override
    public Topic create(Topic topic) {
        TopicEntity topicEntity = this.topicMapper.toTopicEntity(topic);
        return this.topicMapper.toTopic(this.repository.save(topicEntity));
    }

    @Override
    public Iterable<Topic> list() {
        return this.topicMapper.toTopics(this.repository.findAll());
    }

    @Override
    public Optional<Topic> get(UUID id) {
        Optional<TopicEntity> topic = this.repository.findById(id);

        return Optional.of(this.topicMapper.toTopic(topic));
    }

    @Override
    public void delete(UUID id) {
        Optional<TopicEntity> topicEntity = this.repository.findById(id);
        this.repository.deleteById(topicEntity.get().getId());
    }
}
