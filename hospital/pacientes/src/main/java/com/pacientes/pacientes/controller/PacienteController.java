package com.pacientes.pacientes.controller;

import com.pacientes.pacientes.model.Paciente;
import com.pacientes.pacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController{

    @Autowired
    private IPacienteService iPacienteService;

    @GetMapping("/find/{dni}")
    public Paciente findByDni(@PathVariable ("dni") String dni){
        return iPacienteService.getPacienteByDni(dni);
    }

    @PostMapping("/create")
    public String createPaciente(@RequestBody Paciente paciente){
        return iPacienteService.createPaciente(paciente);
    }
}
