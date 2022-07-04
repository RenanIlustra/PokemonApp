package com.example.pokemonapp.api

import com.example.pokemonapp.X.apiX.PokemonServicesX
import com.example.pokemonapp.X.apiX.models.IndividualPokemonApiResult
import com.example.pokemonapp.X.apiX.models.PokemonsApiResult
import com.example.pokemonapp.model.PokemonBlocList
import com.example.pokemonapp.model.SinglePokemon
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object Repository {

    suspend fun listPokemons(limit: Int = 151): PokemonBlocList {
        return RetrofitServices.api.listPokemons(limit)
    }

    suspend fun getPokemon(number: Int): List<SinglePokemon> {

        return RetrofitServices.api.getPokemon(number)
    }
}









