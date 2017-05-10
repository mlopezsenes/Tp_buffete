package com.example.lkdml.tp_buffete.pedido;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lkdml.tp_buffete.Menu_model;
import com.example.lkdml.tp_buffete.R;

import java.util.List;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoAdapter  extends RecyclerView.Adapter<PedidoViewHolder>{
    private List<Menu_model> pedidos;
    private PedidoController pc;
    private IPedidoItemClick pedidoItemListener;

    public void setListener(IPedidoItemClick itemListener) {
        this.pedidoItemListener = itemListener;
    }

    public PedidoController getPc() {
        return pc;
    }

    public void setPc(PedidoController pc) {
        this.pc = pc;
    }

    public List<Menu_model> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Menu_model> pedidos) {
        this.pedidos = pedidos;
    }

    public PedidoAdapter() {
    }

    @Override
    public PedidoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pedido,parent,false);
        PedidoViewHolder pvh = new PedidoViewHolder(v,this.pedidoItemListener);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PedidoViewHolder holder, int position) {
        Menu_model itemMenu = pedidos.get(position);

       // holder.descripcionItem.setText(itemMenu.getDescripcion().toString());
        holder.precioItem.setText("$ "+itemMenu.getPrecio().toString());
        holder.setPosicion(position);


    }

    @Override
    public int getItemCount() {
        return this.pedidos.size();
    }

}
