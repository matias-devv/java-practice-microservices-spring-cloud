package com.exercise.ingredientes.service;

import com.exercise.ingredientes.dto.IngredienteDTO;
import com.exercise.ingredientes.model.Ingrediente;
import com.exercise.ingredientes.repository.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredienteService implements IIngredienteService {

    @Autowired
    private IIngredienteRepository ingredienteRepository;

    @Override
    public String createIngrediente(Ingrediente ingrediente) {
        ingredienteRepository.save(ingrediente);
        return "Se ha creado el ingrediente exitosamente";
    }

    @Override
    public List<IngredienteDTO> getIngredientes(String nombrePlato) {

        List<Ingrediente> listaIngredientes = ingredienteRepository.findAll();
        List<IngredienteDTO> listaRetornar = new ArrayList<>();

        for (Ingrediente ingrediente : listaIngredientes) {

            List<String> listaPlatos = ingrediente.getPlatos();

            if (listaPlatos == null){
                return null;
            }
            for (String plato : listaPlatos){
                if( plato.equals(nombrePlato) ){
                     IngredienteDTO dto = this.setearDatosDTO(ingrediente);
                     listaRetornar.add(dto);
                }
            }
        }
        return listaRetornar;
    }

    private IngredienteDTO setearDatosDTO(Ingrediente ingrediente) {
        IngredienteDTO dto = new IngredienteDTO();
        dto.setId_ingrediente(ingrediente.getId_ingrediente());
        dto.setNombre_ingrediente(ingrediente.getNombre_ingrediente());
        return dto;
    }

}
