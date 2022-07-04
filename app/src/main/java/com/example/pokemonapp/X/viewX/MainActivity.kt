package com.example.pokemonapp.X.viewX

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.R
import com.example.pokemonapp.api.Repository
import com.example.pokemonapp.model.Pokemon
import com.example.pokemonapp.model.PokemonType

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
            url ="",
            types = listOf(PokemonType("GRASS"))
        )
        val pokemons = listOf(bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur,bulbasaur)

        //Função para teste sem usar o Corrotines do Retrofit
        Thread(Runnable {

        }).start()

//        loadPokemons(recyclerView, pokemons)


    }

    private suspend fun loadPokemons(
        recyclerView: RecyclerView,
        pokemons: List<Pokemon>
    ) {
        val pokemonsApiResult = Repository.getPokemon(5)

       pokemonsApiResult.let {
           val linearLayoutManager = LinearLayoutManager(this)
           recyclerView.layoutManager = linearLayoutManager
           recyclerView.adapter = PokemonAdapter(pokemons)
       }

    }


}