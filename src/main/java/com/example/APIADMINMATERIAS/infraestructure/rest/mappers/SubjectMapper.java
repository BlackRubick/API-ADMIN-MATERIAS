package com.example.APIADMINMATERIAS.infraestructure.rest.mappers;

import com.example.APIADMINMATERIAS.domain.models.Subject;
import com.example.APIADMINMATERIAS.infraestructure.entities.SubjectEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "career", target = "career"),
            @Mapping(source = "status", target = "status")
    }
    )
    Subject toSubject(SubjectEntity subject);
    Iterable<Subject> toSubjects(Iterable<SubjectEntity> subjectEntity);

    @InheritInverseConfiguration
    SubjectEntity toSubjectEntity (Subject subject);

    Subject toSubject(Optional<SubjectEntity> subject);
}
