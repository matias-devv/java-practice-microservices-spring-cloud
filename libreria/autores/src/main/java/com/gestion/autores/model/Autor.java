package com.gestion.autores.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_autor;

    private String nombre_completo;
    private LocalDate fecha_nacimiento;
    private String nacionalidad;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> listaLibros;
}
