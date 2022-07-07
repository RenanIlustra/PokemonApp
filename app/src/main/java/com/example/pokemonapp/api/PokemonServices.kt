package com.example.pokemonapp.api

import com.example.pokemonapp.model.PokemonBlocList
import com.example.pokemonapp.model.SinglePokemon
import retrofit2.http.GET
import retrofit2.http.Query

//https://pokeapi.co/api/v2/pokemon?limit=151
interface PokemonServices {
    @GET("pokemon/pokemon?limit={limit}")
    suspend fun listPokemons(@Query("limit") limit: Int): PokemonBlocList

    //https://pokeapi.co/api/v2/pokemon/1/
    @GET("pokemon/{number}")
    suspend fun getPokemon(number : Int): List<SinglePokemon>

}