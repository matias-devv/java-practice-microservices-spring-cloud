package com.turnos.turnos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
public class Paciente {
    private Long idPaciente;
    private String dni;
    private String nombre_paciente;
    private String apellido_paciente;
    private LocalDate fecha_nacimiento;
    private String telefono;

}
