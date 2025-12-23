package com.administracion.envios.service;

import com.administracion.envios.dto.EnvioDTO;
import com.administracion.envios.model.Envio;

import java.util.List;

public interface IEnvioService {

    public String createEnvio(EnvioDTO envioDTO);

    public List<EnvioDTO> getEnviosByDestinatario(Long idDestinatario);


}
