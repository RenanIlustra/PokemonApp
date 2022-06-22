package com.example.pokemonapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemonapp.R
import com.example.pokemonapp.databinding.LayoutPokemonItem2Binding
import com.example.pokemonapp.domain.Pokemon

class PokemonAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutPokemonItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(private val binding: LayoutPokemonItem2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(item: Pokemon) {
            val ivPokemon = binding.layoutPokemonItemImgView
            val tvNumber = binding.layoutPokemonNumber
            val tvName = binding.layoutPokemonItemTxtname
            val tvType1 = binding.layoutType01
            val tvType2 = binding.layoutType01

            // TODO: Load Image

            tvNumber.text = "Nº ${item.number}"
            tvName.text = item.name
            tvType1.text = item.types[0].typeName

            if (item.types.size > 1) {
                tvType2.visibility = View.VISIBLE
                tvType2.text = item.types[1].typeName
            } else {
                tvType2.visibility = View.GONE
            }

        }

    }
}

//
//class PokemonAdapter(
//    val items : List<Pokemon>
//): RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_pokemon_item2,parent,false)
//
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item =items[position]
//
//        holder.bindView(item)
//    }
//
//    override fun getItemCount(): Int {
//        return items.size
//    }
//
//    class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView) {
//
//        fun bindView(item: Pokemon) {
//
//        }
//
//    }
//}