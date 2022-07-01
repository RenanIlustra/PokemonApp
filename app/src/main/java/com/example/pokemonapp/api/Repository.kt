package com.example.pokemonapp.api

import com.example.pokemonapp.X.apiX.PokemonServicesX
import com.example.pokemonapp.X.apiX.models.IndividualPokemonApiResult
import com.example.pokemonapp.X.apiX.models.PokemonsApiResult
import com.example.pokemonapp.model.PokemonBlocList
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object Repository {

    fun listPokemons(limit: Int = 151): PokemonBlocList {
        return RetrofitServices.api.listPokemons()
    }

    fun getPokemon(number: Int): List<IndividualPokemonApiResult>? {
        val call = RetrofitServices.api.getPokemon(number)

        return call.execute().body()
    }
}









