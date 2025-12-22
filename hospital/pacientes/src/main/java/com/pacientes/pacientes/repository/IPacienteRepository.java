package com.pacientes.pacientes.repository;

import com.pacientes.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

    @Query("SELECT Paciente p FROM Paciente p WHERE p.dni = :dni")
    public Paciente findByDni(String dni);
}
