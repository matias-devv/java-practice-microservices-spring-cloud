package com.pacientes.pacientes.service;

import com.pacientes.pacientes.model.Paciente;
import com.pacientes.pacientes.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository iPacienteRepository;

    @Override
    public String createPaciente(Paciente paciente) {
        iPacienteRepository.save(paciente);
        return "El paciente se creo correctamente";
    }

    @Override
    public Paciente getPacienteByDni(String dni) {
        return iPacienteRepository.findByDni(dni);
    }
}
