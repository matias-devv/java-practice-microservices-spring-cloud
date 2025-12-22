package com.spring.probandoCloud.controller;

import com.spring.probandoCloud.dto.PokemonDTO;
import com.spring.probandoCloud.repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokeAPIClient pokeAPIClient;

    @GetMapping("/pokemon/{pokemonID}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonID") int pokemonID){
        return pokeAPIClient.getPokemonInfo(pokemonID);
    }

}
