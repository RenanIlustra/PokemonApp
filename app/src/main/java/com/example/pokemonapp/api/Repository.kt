package com.example.pokemonapp.api

import com.example.pokemonapp.X.apiX.PokemonServices
import com.example.pokemonapp.X.apiX.models.IndividualPokemonApiResult
import com.example.pokemonapp.X.apiX.models.PokemonsApiResult
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object Repository {

    fun listPokemons(limit: Int = 151): List<PokemonsApiResult>? {
        val call = RetrofitServices.api.listPokemons(limit)

        return call.execute().body()
    }

    fun getPokemon(number: Int): List<IndividualPokemonApiResult>? {
        val call = RetrofitServices.api.getPokemon(number)

        return call.execute().body()
    }
}









