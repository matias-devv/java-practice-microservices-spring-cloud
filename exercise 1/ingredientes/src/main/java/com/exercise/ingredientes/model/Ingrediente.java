package com.exercise.ingredientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_ingrediente;

    private String nombre_ingrediente;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> platos;
}
