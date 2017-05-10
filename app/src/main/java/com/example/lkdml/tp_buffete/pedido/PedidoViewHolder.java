package com.example.lkdml.tp_buffete.pedido;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView descripcionItem;
    public TextView precioItem;
    private FloatingActionButton quitar;
    private int posicion;
    private IPedidoItemClick iteitemPedidoListener;


    public PedidoViewHolder(View itemView,IPedidoItemClick iteitemPedidoListener) {
        super(itemView);
        this.descripcionItem = (TextView) itemView.findViewById(R.id.ITP_descripcion);
        this.precioItem = (TextView) itemView.findViewById(R.id.ITP_Precio);
        this.quitar = (FloatingActionButton) itemView.findViewById(R.id.ITP_btnMenos);
        this.quitar.setOnClickListener(this);
        this.iteitemPedidoListener = iteitemPedidoListener;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public void onClick(View v) {
        iteitemPedidoListener.onItemClick(posicion);
    }
}
