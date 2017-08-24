package com.miramicodigo.pokekotlin.ui;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.miramicodigo.pokekotlin.R;
import com.miramicodigo.pokekotlin.adapter.PokeAdapter;
import com.miramicodigo.pokekotlin.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 *
 */

public class PokeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Pokemon> list = new ArrayList<Pokemon>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        initUI();
        populateData();
    }

    private void initUI() {

        recyclerView = (RecyclerView) findViewById(R.id.rvData);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
    }


    private void populateData() {
        String[] nombre = getResources().getStringArray(R.array.nombre);
        String[] cp = getResources().getStringArray(R.array.cp);
        TypedArray imagen = getResources().obtainTypedArray(R.array.imagen);
        for(int i=0; i < nombre.length; i++) {
            Pokemon temp = new Pokemon(nombre[i], cp[i], imagen.getResourceId(i, -1));
            list.add(temp);
        }
        adapter = new PokeAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}
