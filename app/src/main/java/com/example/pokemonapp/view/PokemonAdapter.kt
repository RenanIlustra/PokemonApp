package com.example.pokemonapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemonapp.R
import com.example.pokemonapp.domain.Pokemon

class PokemonAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_pokemon_item2, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) :   RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon) = with(itemView) {
            val ivPokemon = findViewById<ImageView>(R.id.layout_ivPokemon)
            val tvNumber  = findViewById<TextView>(R.id.layout_tvPokemon_number)
            val tvName    = findViewById<TextView>(R.id.layout_tvPokemon_name)
            val tvType1   = findViewById<TextView>(R.id.layout_tvType01)
            val tvType2   = findViewById<TextView>(R.id.layout_tvType02)


//            val ivPokemon = binding.layoutPokemonItemImgView
//            val tvNumber = binding.layoutPokemonNumber
//            val tvName = binding.layoutPokemonItemTxtname
//            val tvType1 = binding.layoutType01
//            val tvType2 = binding.layoutType01

            // TODO: Load Image
            Glide.with(itemView.context).load(item.imgUrl).into(ivPokemon)

            tvName.text = item.name
            tvNumber.text = "Nº ${item.number}"
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