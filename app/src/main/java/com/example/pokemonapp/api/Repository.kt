package com.example.pokemonapp.api

import com.example.pokemonapp.model.PokemonBlocList
import com.example.pokemonapp.model.SinglePokemon


object Repository {

    suspend fun listPokemons(limit: Int = 151): PokemonBlocList {
        return RetrofitServices.api.listPokemons(limit)
    }

    suspend fun getPokemon(number: Int): List<SinglePokemon> {

        return RetrofitServices.api.getPokemon(number)
    }
}









