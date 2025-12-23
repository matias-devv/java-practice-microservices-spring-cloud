package com.administracion.destinatario.controller;

import com.administracion.destinatario.model.Destinatario;
import com.administracion.destinatario.service.IDestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinatario")
public class DestinatarioController {

    @Autowired
    private IDestinatarioService iDestinatarioService;

    @PostMapping("/create")
    public String create(@RequestBody Destinatario destinatario) {
        return iDestinatarioService.createDestinatario(destinatario);
    }
}
