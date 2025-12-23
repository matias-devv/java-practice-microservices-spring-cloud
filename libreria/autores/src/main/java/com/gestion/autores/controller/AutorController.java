package com.gestion.autores.controller;

import com.gestion.autores.model.ActualizarAutor;
import com.gestion.autores.dto.AutorDTO;
import com.gestion.autores.model.Autor;
import com.gestion.autores.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private IAutorService iAutorService;

    @PostMapping("/create")
    public String createAutor(@RequestBody Autor autor) {
        return iAutorService.createAutor(autor);
    }

    @GetMapping("/find/{id_autores}")
    public List<AutorDTO> getAutores(@PathVariable("id_autores") List<Long> id_autores) {
        return iAutorService.getAutores(id_autores);
    }

    @PutMapping("/update")
    public String updateAutores(@RequestBody ActualizarAutor autores_actualizar) {
        return iAutorService.updateAutores(autores_actualizar);
    }
}
