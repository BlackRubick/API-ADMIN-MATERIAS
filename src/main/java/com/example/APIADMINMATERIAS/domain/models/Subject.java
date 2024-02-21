package com.example.APIADMINMATERIAS.domain.models;

import lombok.Data;

import java.util.UUID;

@Data
public class Subject {
    private UUID id;
    private String name;
    private String career;
    private String status;
}
