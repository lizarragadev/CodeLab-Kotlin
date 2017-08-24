package com.miramicodigo.pokekotlin.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.miramicodigo.pokekotlin.R
import com.miramicodigo.pokekotlin.model.PokemonKt
import kotlinx.android.synthetic.main.activity_detalle_kt.*

class DetalleKtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_kt)

        val pokemon = intent.getSerializableExtra("pokemon") as PokemonKt

        tvDetalleKtNombre!!.setText(pokemon.nombre)
        tvDetalleKtCP!!.text = "CP " + pokemon.cp
        ivDetalleKtImagen!!.setImageResource(pokemon.imagen)

    }
}
