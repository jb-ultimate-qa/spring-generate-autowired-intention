package com.example.springgenerateautowiredintention.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
public class AnotherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Setter
    @Getter
    private String prop1;
    @Setter
    @Getter
    private String prop2;
    @Setter
    @Getter
    private int prop3;

    public AnotherEntity() {

    }

}
