package com.gestion.autores.service;

import com.gestion.autores.model.ActualizarAutor;
import com.gestion.autores.dto.AutorDTO;
import com.gestion.autores.model.Autor;
import com.gestion.autores.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService implements IAutorService {

    @Autowired
    private IAutorRepository iAutorRepository;

    @Override
    public String createAutor(Autor autor) {
        iAutorRepository.save(autor);
        return "El autor se registro correctamente";
    }

    @Override
    public List<AutorDTO> getAutores(List<Long> idAutores) {
        List<Autor> listaAutores = iAutorRepository.getAutores(idAutores);
        return this.setAttributesDTO(listaAutores);
    }

    @Override
    public String updateAutores(ActualizarAutor autores_actualizar) {
        //Le paso el id del libro, y los id de los autores a actualizar
        List<Autor> listAutores = iAutorRepository.findAll();
        List<AutorDTO> listAutoresDTO = this.getAutores(autores_actualizar.getId_autores());

            for(AutorDTO autorDTO : listAutoresDTO) {
                for(Autor autor : listAutores) {
                    //si el autor de la BD coincide con el autorDTO
                    if( autor.getId_autor().equals(autorDTO.getId_autor() )) {
                         //le seteo a la entidad "Autor" el id del libro
                         autor.getListaLibros().add(autores_actualizar.getId_libro());
                         //actualizo
                         this.createAutor(autor);
                    }
                }
            }
        return "El libro fue asignado a el o los autores correctamente";
    }

    private List<AutorDTO> setAttributesDTO(List<Autor> listaAutores) {
        List<AutorDTO> listaAutoresDTO = new ArrayList<>();
        if (listaAutores != null){
            for (Autor autor : listaAutores) {
                AutorDTO dto = new AutorDTO();
                dto.setId_autor(autor.getId_autor());
                dto.setNacionalidad(autor.getNacionalidad());
                dto.setNombre_completo(autor.getNombre_completo());
                listaAutoresDTO.add(dto);
            }
        }
        return listaAutoresDTO;
    }


}
