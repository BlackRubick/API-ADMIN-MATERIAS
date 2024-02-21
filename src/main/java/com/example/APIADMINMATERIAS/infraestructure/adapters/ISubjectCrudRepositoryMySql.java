package com.example.APIADMINMATERIAS.infraestructure.adapters;

import com.example.APIADMINMATERIAS.infraestructure.entities.SubjectEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ISubjectCrudRepositoryMySql extends CrudRepository<SubjectEntity, UUID> {
}
