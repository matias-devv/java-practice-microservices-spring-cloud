package com.gestion.libros.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Embeddable
public class AutorDTO {

    private Long id_autor;
    private String nombre_completo;
    private String nacionalidad;
}
