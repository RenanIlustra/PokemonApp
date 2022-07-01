package com.example.pokemonapp.model

data class Pokemon(
    val imgUrl :String? = null,
    var name:String,
    var number:Int? = null,
    val url: String,
    val types: List<PokemonType>
){
    val formattedNumber =  number.toString().padStart(3,'0')
}


