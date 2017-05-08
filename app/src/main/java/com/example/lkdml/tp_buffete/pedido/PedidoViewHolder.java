package com.example.lkdml.tp_buffete.pedido;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.menu.IMenuItemClick;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView descripcion;
    public TextView precio;
    private Button quitar;
    private int posicion;
    private IPedidoItemClick itemListener;


    public PedidoViewHolder(View itemView,IPedidoItemClick itemListener) {
        super(itemView);
        this.descripcion = (TextView) itemView.findViewById(R.id.ITM_descripcion);
        this.precio = (TextView) itemView.findViewById(R.id.ITM_Precio);
        this.quitar = (Button) itemView.findViewById(R.id.ITP_btnMenos);
        this.quitar.setOnClickListener(this);
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
