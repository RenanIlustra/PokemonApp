package com.example.pokemonapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.R
import com.example.pokemonapp.databinding.ActivityMainListBinding
import com.example.pokemonapp.databinding.LayoutPokemonItem2Binding
import com.example.pokemonapp.domain.Pokemon
import com.example.pokemonapp.domain.PokemonType

class MainActivity : AppCompatActivity() {

  //  lateinit var binding: ActivityMainListBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)
        //val recyclerView = binding.rvPokemons

        val bulbasaur = Pokemon(
            imgUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png",
            name = "Bulbasour",
            number = 115,
            types = listOf(PokemonType("GRASS"))
        )
        val pokemons = listOf(bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur)

        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}