package com.administracion.destinatario.feign;

import com.administracion.destinatario.dto.EnvioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="envioapi", url = "http://localhost:9004/envio")
public interface EnvioAPIClient {

    @GetMapping("/traer/{id_destinatario}")
    public List<EnvioDTO> getEnviosByClient(@PathVariable Long id_destinatario);
}
