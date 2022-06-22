package com.example.pokemonapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.R
import com.example.pokemonapp.domain.Pokemon

class PokemonAdapter(
    val items : List<Pokemon>
): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_pokemon_item2,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item =items[position]

        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(item: Pokemon) {

        }

    }
}