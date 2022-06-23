package com.example.pokemonapp.domain

data class Pokemon(
    val imgUrl :String,
    var name:String,
    var number:Int,
    val types: List<PokemonType>
)

