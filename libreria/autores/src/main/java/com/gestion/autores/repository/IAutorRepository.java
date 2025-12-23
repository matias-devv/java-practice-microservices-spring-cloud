package com.gestion.autores.repository;

import com.gestion.autores.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {

    @Query("SELECT a FROM Autor a WHERE a.id_autor IN :idAutores")
    List<Autor> getAutores(@Param("idAutores") List<Long> idAutores);

}
