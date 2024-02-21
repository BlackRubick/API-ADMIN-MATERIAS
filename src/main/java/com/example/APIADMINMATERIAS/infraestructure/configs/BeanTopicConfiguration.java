package com.example.APIADMINMATERIAS.infraestructure.configs;

import com.example.APIADMINMATERIAS.application.services.DomainTopicServiceImpl;
import com.example.APIADMINMATERIAS.application.services.ITopicService;
import com.example.APIADMINMATERIAS.domain.ports.ITopicRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTopicConfiguration {
    @Bean
    ITopicService topicBeanService(final ITopicRepository repository){
        return new DomainTopicServiceImpl(repository);
    }
}
