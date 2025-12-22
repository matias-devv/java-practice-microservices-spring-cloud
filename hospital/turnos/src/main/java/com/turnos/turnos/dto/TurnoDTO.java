package com.turnos.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TurnoDTO {

    private Long id;
    private LocalDate fecha;
    private String tratamiento;
    private String dni_paciente;
}
