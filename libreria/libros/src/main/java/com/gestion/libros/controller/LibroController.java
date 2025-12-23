package com.gestion.libros.controller;

import com.gestion.libros.dto.LibroDTO;
import com.gestion.libros.model.Libro;
import com.gestion.libros.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private ILibroService iLibroService;

    @PostMapping("/create")
    public String createLibro(@RequestBody LibroDTO libroDTO){
        return iLibroService.createLibro(libroDTO);
    }

}
