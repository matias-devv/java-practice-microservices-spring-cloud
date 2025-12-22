package com.exercise.ingredientes.controller;

import com.exercise.ingredientes.dto.IngredienteDTO;
import com.exercise.ingredientes.model.Ingrediente;
import com.exercise.ingredientes.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

    @Autowired
    private IIngredienteService ingredienteService;

    @PostMapping("/crear")
    public String createIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.createIngrediente(ingrediente);
    }

    @GetMapping("/traer/{nombrePlato}")
    public List<IngredienteDTO> getIngredientes(@PathVariable String nombrePlato){
       return ingredienteService.getIngredientes(nombrePlato);
    }

}
