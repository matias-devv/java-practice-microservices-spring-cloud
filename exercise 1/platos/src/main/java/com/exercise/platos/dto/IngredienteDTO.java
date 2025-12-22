package com.exercise.platos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class IngredienteDTO {

    private long id_ingrediente;
    private String nombre_ingrediente;

}
