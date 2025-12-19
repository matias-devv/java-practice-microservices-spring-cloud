package com.todocodeacademy.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Getter
@Setter
public class TurnoDTO {

    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;
}
