package com.example.APIADMINMATERIAS.infraestructure.configs;

import com.example.APIADMINMATERIAS.application.services.DomainSubjectServiceImpl;
import com.example.APIADMINMATERIAS.application.services.ISubjectService;
import com.example.APIADMINMATERIAS.domain.ports.ISubjectRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanSubjectConfiguration {
    @Bean
    ISubjectService subjectBeanService(final ISubjectRepository repository){
        return new DomainSubjectServiceImpl(repository);
    }
}
