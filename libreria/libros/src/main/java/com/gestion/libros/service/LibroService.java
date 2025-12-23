package com.gestion.libros.service;

import com.gestion.libros.dto.ActualizarAutor;
import com.gestion.libros.dto.AutorDTO;
import com.gestion.libros.dto.LibroDTO;
import com.gestion.libros.feign.autorAPIClient;
import com.gestion.libros.model.Libro;
import com.gestion.libros.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository iLibroRepository;

    @Autowired
    private autorAPIClient autorAPIClient;

    @Override
    public String createLibro(LibroDTO libroDTO) {

        List<AutorDTO> listAutoresDTO = autorAPIClient.getAutores( libroDTO.getId_autores() );

        Libro libro = this.setAttributesToLibro(libroDTO, listAutoresDTO);

        iLibroRepository.save(libro);

        this.actualizeAutores( libro.getISBN(), listAutoresDTO );

        return "El libro se registro correctamente";
    }

    private Libro setAttributesToLibro(LibroDTO libroDTO, List<AutorDTO> listAutoresDTO) {
        Libro libro = new Libro();
        libro.setISBN(libroDTO.getISBN());
        libro.setTitulo(libroDTO.getTitulo());
        libro.setAnio(libroDTO.getAnio());
        libro.setDescripcion(libroDTO.getDescripcion());
        libro.setListAutores(listAutoresDTO);
        return libro;
    }

    private void actualizeAutores(Long ISBN, List<AutorDTO> listAutoresDTO) {
        ActualizarAutor actualizar = new ActualizarAutor();
        List<Long> id_autores_actualizar = new ArrayList<>();

        //recorro la lista recibida de autores -> agrego ids a la lista
        for(AutorDTO autorDTO : listAutoresDTO) {
                 id_autores_actualizar.add(autorDTO.getId_autor());
        }

        //seteo la lista de autores y el id del libro
        actualizar.setId_autores(id_autores_actualizar);
        actualizar.setId_libro(ISBN);

        //Llamo al endpoint y actualizo una vez seteada la lista de autores a actualizar
        autorAPIClient.updateAutores(actualizar);
    }
}
