package com.example.APIADMINMATERIAS.infraestructure.adapters;

import com.example.APIADMINMATERIAS.infraestructure.entities.TopicEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ITopicCrudRepositoryMySql extends CrudRepository<TopicEntity, UUID> {
}
