package com.example.pokemonapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokemonapp.R
import com.example.pokemonapp.databinding.ActivityMainListBinding
import com.example.pokemonapp.databinding.LayoutPokemonItem2Binding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        val recyclerView = binding.rvPokemons

        val linearLayoutManager = LinearLayoutManager(this)
    }
}