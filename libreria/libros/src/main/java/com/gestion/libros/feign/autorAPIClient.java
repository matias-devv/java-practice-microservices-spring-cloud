package com.gestion.libros.feign;

import com.gestion.libros.dto.ActualizarAutor;
import com.gestion.libros.dto.AutorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient( name = "autorapi", url = "http://localhost:9003/autor")
public interface autorAPIClient {

    @GetMapping("/find/{id_autores}")
    public List<AutorDTO> getAutores(@PathVariable("id_autores") List<Long> id_autores);

    @PutMapping("/update")
    public String updateAutores(@RequestBody ActualizarAutor actualizarAutor);
}
