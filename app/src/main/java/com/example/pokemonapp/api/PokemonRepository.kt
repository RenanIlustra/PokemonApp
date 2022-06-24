package com.example.pokemonapp.api

import android.util.Log
import com.example.pokemonapp.api.models.IndividualPokemonApiResult
import com.example.pokemonapp.api.models.PokemonsApiResult
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class PokemonRepository {
    //https://pokeapi.co/api/v2/
    val service :PokemonServices

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonServices::class.java)
    }

    fun listPokemons(limit: Int = 151): List<PokemonsApiResult>? {
        val call = service.listPokemons(limit)

        return call.execute().body()
    }



    fun getPokemon(number: Int): List<IndividualPokemonApiResult>? {
        val call = service.getPokemon(number)

        return call.execute().body()
    }



}






