package com.miramicodigo.pokekotlin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.miramicodigo.pokekotlin.R;
import com.miramicodigo.pokekotlin.model.Pokemon;

public class DetalleActivity extends AppCompatActivity {

    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvCP = (TextView) findViewById(R.id.tvDetalleCP);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");

        tvNombre.setText(pokemon.getNombre().toString());
        tvCP.setText("CP "+pokemon.getCp().toString());
        ivImagen.setImageResource(pokemon.getImagen());

    }
}
