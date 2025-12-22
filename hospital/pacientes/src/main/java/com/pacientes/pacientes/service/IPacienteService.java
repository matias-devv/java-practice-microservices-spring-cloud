package com.pacientes.pacientes.service;

import com.pacientes.pacientes.model.Paciente;

public interface IPacienteService {

    public String createPaciente(Paciente paciente);

    public Paciente getPacienteByDni(String dni);

}
