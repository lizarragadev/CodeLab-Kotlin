package com.miramicodigo.pokekotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

import com.miramicodigo.pokekotlin.R
import com.miramicodigo.pokekotlin.adapter.PokeKtAdapter
import com.miramicodigo.pokekotlin.model.PokemonKt

import java.util.ArrayList

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 */

class PokeKtActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val list = ArrayList<PokemonKt>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex_kotlin)
        initUI()
        populateData()
    }

    private fun initUI() {

        recyclerView = findViewById(R.id.rvKtData) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        layoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
    }


    private fun populateData() {
        val nombre = resources.getStringArray(R.array.nombre)
        val cp = resources.getStringArray(R.array.cp)
        val imagen = resources.obtainTypedArray(R.array.imagen)
        for (i in nombre.indices) {
            val temp = PokemonKt(nombre[i], cp[i], imagen.getResourceId(i, -1))
            list.add(temp)
        }
        adapter = PokeKtAdapter(this, list)
        recyclerView!!.adapter = adapter
    }
}
