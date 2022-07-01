package com.example.pokemonapp.X.apiX

import com.example.pokemonapp.X.apiX.models.IndividualPokemonApiResult
import com.example.pokemonapp.X.apiX.models.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//https://pokeapi.co/api/v2/pokemon?limit=151
interface PokemonServicesX {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<List<PokemonsApiResult>>

//https://pokeapi.co/api/v2/pokemon/1/
    @GET("pokemon/{number}")
    fun getPokemon(number : Int): Call<List<IndividualPokemonApiResult>>

}