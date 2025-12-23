package com.administracion.envios.service.implementation;

import com.administracion.envios.dto.EnvioDTO;
import com.administracion.envios.model.Envio;
import com.administracion.envios.repository.IEnvioRepository;
import com.administracion.envios.service.IEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnvioService implements IEnvioService {

    @Autowired
    private IEnvioRepository iEnvioRepository;

    @Override
    public String createEnvio(EnvioDTO envioDTO) {
        Envio envio = this.setAttributes(envioDTO);
        iEnvioRepository.save(envio);
        return "El envio se creo correctamente";
    }

    private Envio setAttributes(EnvioDTO envioDTO) {
        Envio envio = new Envio();
        envio.setFecha(envioDTO.getFecha());
        envio.setEstado_procesamiento(envioDTO.getEstado_procesamiento());
        envio.setDescripcion(envioDTO.getDescripcion());
        envio.setId_destinatario(envioDTO.getId_destinatario());
        return envio;
    }

    @Override
    public List<EnvioDTO> getEnviosByDestinatario(Long id_destinatario) {
        List<Envio> listaEnvios = iEnvioRepository.getEnviosByDestinatario(id_destinatario);
        return this.convertEnvioToDTO(listaEnvios);
    }

    private List<EnvioDTO> convertEnvioToDTO(List<Envio> listaEnvios) {
        List<EnvioDTO> listaRetornar = new ArrayList<>();
        for(Envio envio : listaEnvios) {
            EnvioDTO dto = new EnvioDTO();
            dto.setId(envio.getId());
            dto.setFecha(envio.getFecha());
            dto.setEstado_procesamiento(envio.getEstado_procesamiento());
            dto.setDescripcion(envio.getDescripcion());
            dto.setId_destinatario(envio.getId_destinatario());
            listaRetornar.add(dto);
        }
        return listaRetornar;
    }
}
