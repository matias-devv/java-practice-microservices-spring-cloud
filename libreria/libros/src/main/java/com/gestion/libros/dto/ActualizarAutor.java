package com.gestion.libros.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ActualizarAutor {

    private List<Long> id_autores;
    private Long id_libro;
}
