package com.example.lkdml.tp_buffete.menu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lkdml.tp_buffete.R;

import java.util.List;

/**
 * Created by lkdml on 6/5/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private List<Menu_model> menu;
    private MenuController mc;
    private IMenuItemClick itemListener;

    public void setListener(IMenuItemClick itemListener) {
        this.itemListener = itemListener;
    }

    public MenuController getMc() {
        return mc;
    }

    public void setMc(MenuController mc) {
        this.mc = mc;
    }

    public List<Menu_model> getMenu() {
        return menu;
    }

    public MenuAdapter() {
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        MenuViewHolder mvh = new MenuViewHolder(v,this.itemListener);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
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
