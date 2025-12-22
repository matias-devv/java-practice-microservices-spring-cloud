package com.exercise.platos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Setter @Getter
public class Ingrediente {

    private Long id_ingrediente;
    private String nombre_ingrediente;
    private List<String> platos;

}
