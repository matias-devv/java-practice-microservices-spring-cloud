package com.exercise.ingredientes.service;

import com.exercise.ingredientes.dto.IngredienteDTO;
import com.exercise.ingredientes.model.Ingrediente;

import java.util.List;

public interface IIngredienteService {

    public List<IngredienteDTO> getIngredientes(String nombrePlato);

    String createIngrediente(Ingrediente ingrediente);
}
