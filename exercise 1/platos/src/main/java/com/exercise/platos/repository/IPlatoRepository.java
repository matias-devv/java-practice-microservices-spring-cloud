package com.exercise.platos.repository;

import com.exercise.platos.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository<Plato, Long>{
}
