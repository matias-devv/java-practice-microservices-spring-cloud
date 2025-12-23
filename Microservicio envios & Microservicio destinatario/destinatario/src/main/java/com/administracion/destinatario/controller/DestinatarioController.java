package com.administracion.destinatario.controller;

import com.administracion.destinatario.dto.EnvioDTO;
import com.administracion.destinatario.model.Destinatario;
import com.administracion.destinatario.service.IDestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinatario")
public class DestinatarioController {

    @Autowired
    private IDestinatarioService iDestinatarioService;

    @PostMapping("/create")
    public String create(@RequestBody Destinatario destinatario) {
        return iDestinatarioService.createDestinatario(destinatario);
    }

    @GetMapping("/traer/{id_destinatario}")
    public List<EnvioDTO> getEnviosByDestinatario(@PathVariable Long id_destinatario) {
        return iDestinatarioService.getEnviosByDestinatario(id_destinatario);
    }
}
