package com.example.pokemonapp.api

import com.example.pokemonapp.X.apiX.PokemonServicesX
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServices {

    private val retrofit by lazy {
       Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:PokemonServicesX by lazy {
        retrofit.create(PokemonServices::class.java) // trocar o tipo para  PokemonServices
        retrofit.create(PokemonServicesX::class.java)
    }
}