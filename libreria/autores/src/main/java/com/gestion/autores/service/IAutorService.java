package com.gestion.autores.service;

import com.gestion.autores.model.ActualizarAutor;
import com.gestion.autores.dto.AutorDTO;
import com.gestion.autores.model.Autor;

import java.util.List;

public interface IAutorService {

    public String createAutor(Autor autor);

    public List<AutorDTO> getAutores(List<Long> idAutores);

    public String updateAutores(ActualizarAutor autores_actualizar);
}
