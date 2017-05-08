package com.example.lkdml.tp_buffete.pedido;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lkdml.tp_buffete.Menu_model;
import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.menu.IMenuItemClick;
import com.example.lkdml.tp_buffete.menu.MenuViewHolder;
import com.example.lkdml.tp_buffete.menu.MenuController;

import java.util.List;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoAdapter  extends RecyclerView.Adapter<PedidoViewHolder>{
    private List<Menu_model> menu;
    private PedidoController pc;
    private IPedidoItemClick itemListener;

    public void setListener(IPedidoItemClick itemListener) {
        this.itemListener = itemListener;
    }

    public PedidoController getPc() {
        return pc;
    }

    public void setPc(PedidoController pc) {
        this.pc = pc;
    }

    public List<Menu_model> getMenu() {
        return menu;
    }

    public PedidoAdapter() {
    }

    @Override
    public PedidoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        PedidoViewHolder pvh = new PedidoViewHolder(v,this.itemListener);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PedidoViewHolder holder, int position) {
        Menu_model itemMenu = menu.get(position);
        holder.descripcion.setText(itemMenu.getDescripcion());
        holder.precio.setText("$ "+itemMenu.getPrecio().toString());
        holder.setPosicion(position);


    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public void setMenu(List<Menu_model> menu) {
        this.menu = menu;
    }
}
