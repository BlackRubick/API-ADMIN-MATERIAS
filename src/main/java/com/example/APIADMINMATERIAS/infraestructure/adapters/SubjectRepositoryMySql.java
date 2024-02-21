package com.example.APIADMINMATERIAS.infraestructure.adapters;

import com.example.APIADMINMATERIAS.domain.models.Subject;
import com.example.APIADMINMATERIAS.domain.ports.ISubjectRepository;
import com.example.APIADMINMATERIAS.infraestructure.entities.SubjectEntity;
import com.example.APIADMINMATERIAS.infraestructure.rest.mappers.SubjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@Slf4j
public class SubjectRepositoryMySql implements ISubjectRepository{
    private final ISubjectCrudRepositoryMySql repository;

    @Autowired
    private SubjectMapper subjectMapper;

    public SubjectRepositoryMySql(ISubjectCrudRepositoryMySql repository) {
        this.repository = repository;
    }

    @Override
    public Subject create(Subject subject) {
        SubjectEntity subjectEntity = this.subjectMapper.toSubjectEntity(subject);
        return this.subjectMapper.toSubject(this.repository.save(subjectEntity));
    }

    @Override
    public void delete(UUID id) {
        Optional<SubjectEntity> subjectEntity = this.repository.findById(id);
        this.repository.deleteById(subjectEntity.get().getId());
    }

    @Override
    public Iterable<Subject> list() {
        return this.subjectMapper.toSubjects(this.repository.findAll());
    }

    @Override
    public Optional<Subject> get(UUID id) {
        Optional<SubjectEntity> subject = this.repository.findById(id);

        return Optional.of(this.subjectMapper.toSubject(subject));
    }
}
