package com.example.pokemonapp.api.models

import com.example.pokemonapp.domain.PokemonType
import java.net.IDN

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)

data class PokemonResult(
    val name: String,
    val url: String
)

data class IndividualPokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot
)

data class PokemonTypeSlot(
    val slot: PokemonType
)