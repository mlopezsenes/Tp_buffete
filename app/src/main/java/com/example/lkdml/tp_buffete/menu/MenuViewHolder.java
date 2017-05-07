package com.example.lkdml.tp_buffete.menu;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;

/**
 * Created by lkdml on 6/5/2017.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView descripcion;
    public TextView precio;
    private Button agregar;
    private int posicion;
    private IMenuItemClick itemListener;


    public MenuViewHolder(View itemView,IMenuItemClick itemListener) {
        super(itemView);
        this.descripcion = (TextView) itemView.findViewById(R.id.ITM_descripcion);
        this.precio = (TextView) itemView.findViewById(R.id.ITM_Precio);
        this.agregar = (Button) itemView.findViewById(R.id.ITM_btnMas);
        this.agregar.setOnClickListener(this);
        this.itemListener=itemListener;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public void onClick(View v) {
        itemListener.onItemClick(posicion);
    }
}
