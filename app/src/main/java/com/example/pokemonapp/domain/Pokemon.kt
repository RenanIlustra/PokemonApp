package com.example.pokemonapp.domain

data class Pokemon(
    var nome:String,
    var type:String,
    var number:Int,
    val types: List<PokemonType>
)

