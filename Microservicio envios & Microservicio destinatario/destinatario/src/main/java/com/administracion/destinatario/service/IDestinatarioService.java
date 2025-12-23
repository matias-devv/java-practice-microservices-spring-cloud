package com.administracion.destinatario.service;

import com.administracion.destinatario.dto.EnvioDTO;
import com.administracion.destinatario.model.Destinatario;

import java.util.List;

public interface IDestinatarioService {

    public String createDestinatario(Destinatario destinatario);

    public List<EnvioDTO> getEnviosByDestinatario(Long id_destinatario);
}
