package com.spring.probandoCloud.repository;

import com.spring.probandoCloud.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="pokeapi",url = "https://pokeapi.co/api/v2")
public interface PokeAPIClient {

    @GetMapping("/pokemon/{pokemonID}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonID") int pokemonID);
}
