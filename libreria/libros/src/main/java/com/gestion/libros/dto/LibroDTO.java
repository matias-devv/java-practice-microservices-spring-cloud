package com.gestion.libros.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {

    private Long ISBN;
    private String titulo;
    private Integer anio;
    private String descripcion;

    private List<Long> id_autores;
}
