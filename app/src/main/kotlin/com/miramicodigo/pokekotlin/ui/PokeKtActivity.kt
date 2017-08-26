package com.miramicodigo.pokekotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.miramicodigo.pokekotlin.R
import com.miramicodigo.pokekotlin.model.Pokemon

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 *
 */

class PokeKtActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private val list = ArrayList<Pokemon>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex_kotlin)
        initUI()
        populateData()
    }

    private fun initUI() {

    }


    private fun populateData() {

    }
}