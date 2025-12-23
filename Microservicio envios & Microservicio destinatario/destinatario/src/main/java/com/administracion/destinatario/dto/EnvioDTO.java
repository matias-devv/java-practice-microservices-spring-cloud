package com.administracion.destinatario.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EnvioDTO {

    private Long id;
    private LocalDate fecha;
    private String estado_procesamiento;
    private String descripcion;
    private Long id_destinatario;
}
