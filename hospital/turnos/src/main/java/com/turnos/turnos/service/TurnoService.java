package com.turnos.turnos.service;

import com.turnos.turnos.dto.TurnoDTO;
import com.turnos.turnos.model.Paciente;
import com.turnos.turnos.model.Turno;
import com.turnos.turnos.repository.ITurnoRepository;
import com.turnos.turnos.repository.pacienteAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository iTurnoRepository;

    @Autowired
    private pacienteAPIClient pacienteAPIClient;

    @Override
    public String createTurno(TurnoDTO turnoDTO) {
        Paciente paciente = pacienteAPIClient.getPacienteByDni(turnoDTO.getDni_paciente());
        Turno turno = new Turno();
        String nombreCompleto = paciente.getNombre_paciente() + " " + paciente.getApellido_paciente();

        turno.setFecha(turnoDTO.getFecha());
        turno.setTratamiento(turnoDTO.getTratamiento());
        turno.setNombreCompletoPaciente(nombreCompleto);
        iTurnoRepository.save(turno);
        return "el turno se guardo correctamente";
    }
}
