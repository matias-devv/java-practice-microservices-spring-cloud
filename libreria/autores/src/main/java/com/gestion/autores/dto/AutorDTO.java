package com.gestion.autores.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class AutorDTO {

    private Long id_autor;
    private String nombre_completo;
    private String nacionalidad;
}
