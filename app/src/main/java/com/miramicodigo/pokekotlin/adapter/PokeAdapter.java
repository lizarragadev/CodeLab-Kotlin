package com.miramicodigo.pokekotlin.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.miramicodigo.pokekotlin.R;
import com.miramicodigo.pokekotlin.model.Pokemon;
import com.miramicodigo.pokekotlin.ui.DetalleActivity;

import java.util.List;

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 *
 */

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.ViewHolder> {
    private List<Pokemon> list;
    private Context context;

    public PokeAdapter(Context context, List<Pokemon> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon pokemon = list.get(position);
        holder.tvCP.setText(pokemon.getCp());
        holder.tvNombre.setText(pokemon.getNombre());
        holder.ivImagen.setImageResource(pokemon.getImagen());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvCP;
        public TextView tvNombre;
        public ImageView ivImagen;
        public View view;

        public ViewHolder(View v) {
            super(v);
            this.view = v;
            tvCP = (TextView) v.findViewById(R.id.tvCP);
            tvNombre = (TextView) v.findViewById(R.id.tvNombre);
            ivImagen = (ImageView) v.findViewById(R.id.ivImagen);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Pokemon pokemon = list.get(getAdapterPosition());
                    Intent intent = new Intent(context, DetalleActivity.class);
                    intent.putExtra("pokemon", pokemon);
                    context.startActivity(intent);
                }
            });
        }

    }

}