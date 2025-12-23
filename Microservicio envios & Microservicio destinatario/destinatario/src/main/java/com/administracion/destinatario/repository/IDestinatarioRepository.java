package com.administracion.destinatario.repository;

import com.administracion.destinatario.model.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinatarioRepository extends JpaRepository<Destinatario,Long> {
}
