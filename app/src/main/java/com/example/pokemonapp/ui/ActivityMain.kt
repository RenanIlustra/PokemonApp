package com.example.pokemonapp.ui

import androidx.appcompat.app.AppCompatActivity
import com.example.pokemonapp.databinding.ActivityMainListBinding

class ActivityMain: AppCompatActivity() {

    private var _binding: ActivityMainListBinding? = null
    private val binding get() = _binding!!


    override fun onDestroy() {
        super.onDestroy()
        _binding =null
    }
}

