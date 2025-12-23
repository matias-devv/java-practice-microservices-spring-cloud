package com.administracion.destinatario.service;

import com.administracion.destinatario.dto.EnvioDTO;
import com.administracion.destinatario.feign.EnvioAPIClient;
import com.administracion.destinatario.model.Destinatario;
import com.administracion.destinatario.repository.IDestinatarioRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinatarioService implements IDestinatarioService {

    @Autowired
    private IDestinatarioRepository iDestinatarioRepository;

    @Autowired
    private EnvioAPIClient envioAPIClient;

    @Override
    public String createDestinatario(Destinatario destinatario) {
        iDestinatarioRepository.save(destinatario);
        return "El destinatario se creo exitosamente";
    }

    @Override
    public List<EnvioDTO> getEnviosByDestinatario(Long id_destinatario) {
        return envioAPIClient.getEnviosByClient(id_destinatario);
    }
}
