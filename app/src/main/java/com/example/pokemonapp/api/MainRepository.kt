package com.example.pokemonapp.api

import com.example.pokemonapp.model.SinglePokemon

class MainRepository constructor(private val retrofitServices: RetrofitServices) {

    suspend fun getPokemon(number: Int): List<SinglePokemon> {
        return retrofitServices.api.getPokemon(number)
    }
}