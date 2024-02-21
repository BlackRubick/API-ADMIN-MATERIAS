package com.example.APIADMINMATERIAS.infraestructure.rest.mappers;

import com.example.APIADMINMATERIAS.domain.models.Topic;
import com.example.APIADMINMATERIAS.infraestructure.entities.TopicEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface TopicMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "status", target = "status"),
    }
    )
    Topic toTopic(TopicEntity topic);
    Iterable<Topic> toTopics(Iterable<TopicEntity> topicEntity);

    @InheritInverseConfiguration
    TopicEntity toTopicEntity (Topic topic);

    Topic toTopic(Optional<TopicEntity> topic);
}
