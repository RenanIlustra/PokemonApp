package com.example.pokemonapp.model

import com.example.pokemonapp.X.apiX.models.PokemonTypeSlot

data class SinglePokemon (
        val id: Int,
        val name: String,
        val types: PokemonTypeSlot
        )