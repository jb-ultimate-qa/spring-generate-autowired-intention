package com.example.springgenerateautowiredintention.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Getter
    private String prop1;
    @Setter
    @Getter
    private String prop2;
    @Setter
    @Getter
    private int prop3;

    public MyEntity() {

    }

}
