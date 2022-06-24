package com.example.pokemonapp.api

import com.example.pokemonapp.api.models.IndividualPokemonApiResult
import com.example.pokemonapp.api.models.PokemonResult
import com.example.pokemonapp.api.models.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//https://pokeapi.co/api/v2/pokemon?limit=151
interface PokemonServices {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<List<PokemonsApiResult>>

//https://pokeapi.co/api/v2/pokemon/1/
    @GET("pokemon/{number}")
    fun getPokemon(number : Int): Call<List<IndividualPokemonApiResult>>

}