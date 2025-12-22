package com.exercise.platos.model;

import com.exercise.platos.dto.IngredienteDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_plato;

    private String nombre;
    private double precio;
    private String descripcion;

    @ElementCollection(fetch = FetchType.LAZY)
    private List<String> ingredienteList;
}
