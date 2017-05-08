package com.example.lkdml.tp_buffete.menu;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lkdml on 6/5/2017.
 */

public class MenuController implements IMenuItemClick {

    private List<Menu_model> menu;

    public ArrayList<Menu_model> getPedidos() {
        return pedidos;
    }

    private ArrayList<Menu_model> pedidos;
    private MenuAdapter mAdapter;
    private IActualizarPedido actualizarPedido;

    public MenuController(MenuAdapter mAdapter, IActualizarPedido actualizarPedido) {

        this.pedidos = new ArrayList<Menu_model>();
        this.menu = new ArrayList<Menu_model>();
        menu.add(new Menu_model("Producto 01",2.4));
        menu.add(new Menu_model("Producto 02",2.4));
        menu.add(new Menu_model("Producto 03",2.4));
        menu.add(new Menu_model("Producto 04",2.4));
        menu.add(new Menu_model("Producto 05",2.4));
        menu.add(new Menu_model("Producto 06",2.4));
        menu.add(new Menu_model("Producto 07",2.4));
        menu.add(new Menu_model("Producto 08",2.4));
        menu.add(new Menu_model("Producto 09",2.4));
        menu.add(new Menu_model("Producto 10",2.4));
        menu.add(new Menu_model("Producto 11",2.4));
        menu.add(new Menu_model("Producto mas caro de la historia, ya que no puede mostrar mas datos",1112.4));
        menu.add(new Menu_model("Producto mas caro de la historia, ya que no puede mostrar mas datos",1212.4));
        menu.add(new Menu_model("Producto mas caro de la historia, ya que no puede mostrar mas datos",1332.4));
        menu.add(new Menu_model("Producto mas caro de la historia, ya que no puede mostrar mas datos",1412.4));

        this.mAdapter = mAdapter;
        mAdapter.setMenu(menu);
        mAdapter.setListener(this);
        
        this.actualizarPedido = actualizarPedido;

    }

    @Override
    public void onItemClick(int position) {
        Log.d("Se hace click en:", "la posision "+ String.valueOf(position));
        this.agregarPedido(position);
        this.actualizarPedido.actualizarPedido(this.calcularPrecio(pedidos),pedidos.size());
    }

    private void agregarPedido(int position){
        this.pedidos.add(menu.get(position));
    }

    private Double calcularPrecio(List<Menu_model> pedido){
        Double precio = 0.0;
        for (Menu_model item: pedido ) {
            precio += item.getPrecio();
            
        }
        return precio;
    }


    public List<Menu_model> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu_model> menu) {
        this.menu = menu;
    }
}
