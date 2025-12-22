package com.exercise.ingredientes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor @Getter
@Setter
public class IngredienteDTO {
    private Long id_ingrediente;
    private String nombre_ingrediente;
}
