package com.example.APIADMINMATERIAS.domain.models;

import lombok.Data;

import java.util.UUID;

@Data
public class Topic {
    private UUID id;
    private String name;
    private String status;
}
