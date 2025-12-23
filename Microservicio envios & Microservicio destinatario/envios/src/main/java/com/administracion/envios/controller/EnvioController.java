package com.administracion.envios.controller;

import com.administracion.envios.dto.EnvioDTO;
import com.administracion.envios.service.IEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/envio")
public class EnvioController {

    @Autowired
    private IEnvioService iEnvioService;

    @PostMapping("/create")
    public String createEnvio(@RequestBody EnvioDTO envioDTO) {
        return iEnvioService.createEnvio(envioDTO);
    }


    @GetMapping("/traer/{id_destinatario}")
    public List<EnvioDTO> getEnviosByDestinatario(@PathVariable Long id_destinatario) {
        return iEnvioService.getEnviosByDestinatario(id_destinatario);
    }
}
