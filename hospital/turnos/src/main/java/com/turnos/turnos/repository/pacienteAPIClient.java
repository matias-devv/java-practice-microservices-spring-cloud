package com.turnos.turnos.repository;

import com.turnos.turnos.model.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="patientapi", url = "localhost:9004/pacientes")
public interface pacienteAPIClient {

    @GetMapping("/find/{dni}")
    public Paciente getPacienteByDni(@PathVariable("dni") String dni);
}
