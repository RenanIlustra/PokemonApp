package com.example.pokemonapp.X.apiX.models

import com.example.pokemonapp.model.Pokemon
import com.example.pokemonapp.model.PokemonType

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)


data class IndividualPokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot
)

data class PokemonTypeSlot(
    val slot: PokemonType
)