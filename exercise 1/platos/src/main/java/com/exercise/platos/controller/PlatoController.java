package com.exercise.platos.controller;

import com.exercise.platos.dto.PlatoDTO;
import com.exercise.platos.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/platos")
public class PlatoController {

    @Autowired
    private IPlatoService iPlatoService;

    @PostMapping("/crear")
    public String createPlato(@RequestBody PlatoDTO platoDTO){
        return iPlatoService.savePlato(platoDTO);
    }
}
