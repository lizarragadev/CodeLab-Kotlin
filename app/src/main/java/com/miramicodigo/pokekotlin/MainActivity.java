package com.miramicodigo.pokekotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.miramicodigo.pokekotlin.ui.PokeActivity;
import com.miramicodigo.pokekotlin.ui.PokeKtActivity;

public class MainActivity extends AppCompatActivity {

    private CardView cvJava;
    private CardView cvKotlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvJava = (CardView) findViewById(R.id.cvJava);
        cvKotlin = (CardView) findViewById(R.id.cvKotlin);

        cvJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PokeActivity.class);
                startActivity(intent);
            }
        });

        cvKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PokeKtActivity.class);
                startActivity(intent);
            }
        });
    }
}
