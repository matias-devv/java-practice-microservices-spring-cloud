package com.spring.probandoCloud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PokemonDTO {

    private Long id;
    private String name;
    private String base_experience;
}
