package com.administracion.envios.repository;

import com.administracion.envios.model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEnvioRepository extends JpaRepository<Envio,Integer> {

    @Query("SELECT e FROM Envio e WHERE e.id_destinatario = :id_destinatario")
    List<Envio> getEnviosByDestinatario( @Param("id_destinatario") Long id_destinatario);

}
