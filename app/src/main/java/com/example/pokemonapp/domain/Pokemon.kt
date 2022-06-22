package com.example.pokemonapp.domain

data class Pokemon(
    var name:String,
    var number:Int,
    val types: List<PokemonType>
)

