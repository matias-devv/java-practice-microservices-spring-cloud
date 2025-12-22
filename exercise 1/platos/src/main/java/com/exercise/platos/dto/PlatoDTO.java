package com.exercise.platos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PlatoDTO {

    private Long num_plato;
    private String nombre;
    private double precio;
    private String descripcion;
}
