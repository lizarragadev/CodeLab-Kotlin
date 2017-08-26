package com.miramicodigo.pokekotlin.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.miramicodigo.pokekotlin.R
import com.miramicodigo.pokekotlin.model.Pokemon
import com.miramicodigo.pokekotlin.ui.DetalleKtActivity

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 */

class PokeKtAdapter(var context: Context, var list: ArrayList<Pokemon>) : RecyclerView.Adapter<PokeKtAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_list, parent, false), list)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val nombre : String? = list[position].nombre
        val cp : String? = list[position].cp
        val imagen : Int = list[position].imagen

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(var view: View, var lis : ArrayList<Pokemon>) : RecyclerView.ViewHolder(view) {
        init {

        }

    }

}

