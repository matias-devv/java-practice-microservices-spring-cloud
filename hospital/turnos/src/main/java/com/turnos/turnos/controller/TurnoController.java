package com.turnos.turnos.controller;

import com.turnos.turnos.dto.TurnoDTO;
import com.turnos.turnos.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private ITurnoService iTurnoService;

    @PostMapping("/create")
    public String createTurno(@RequestBody TurnoDTO turno) {
        return iTurnoService.createTurno(turno);
    }
}
