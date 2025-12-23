package com.gestion.libros.model;

import com.gestion.libros.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Libro {

    @Id // lo mapee solo con @id por que en el metodo POST ya viene el ISBN
    private Long ISBN;
    private String titulo;
    private Integer anio;
    private String descripcion;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<AutorDTO> listAutores;

}
