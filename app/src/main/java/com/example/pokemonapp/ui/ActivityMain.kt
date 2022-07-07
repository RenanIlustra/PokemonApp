package com.example.pokemonapp.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.pokemonapp.R


class ActivityMain : AppCompatActivity() {

    //BINDVIEW DA MAIN FOI DESATIVADO
    val bot_hamburger = findViewById<ImageView>(R.id.btn_hamburger)

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        bot_hamburger.setOnClickListener {
          //  findNavController().navigate(R.id.action_listFragment_to_detailsFragment)
        }
    }


    override fun onDestroy() {
        super.onDestroy()

    }
}

