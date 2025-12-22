package com.exercise.platos.service;

import com.exercise.platos.dto.PlatoDTO;
import org.springframework.stereotype.Service;

public interface IPlatoService {

    public String savePlato(PlatoDTO platoDTO);
}
