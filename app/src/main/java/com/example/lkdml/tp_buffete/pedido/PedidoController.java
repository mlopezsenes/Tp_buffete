package com.example.lkdml.tp_buffete.pedido;

import android.util.Log;

import com.example.lkdml.tp_buffete.Menu_model;
import com.example.lkdml.tp_buffete.menu.IActualizarPedido;
import com.example.lkdml.tp_buffete.menu.IMenuItemClick;
import com.example.lkdml.tp_buffete.menu.MenuAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoController implements IPedidoItemClick {

    private List<Menu_model> menu;
    private List<Menu_model> pedidos;
    private PedidoAdapter pAdapter;
    private IActualizarPedido actualizarPedido;

    public PedidoController(PedidoAdapter pAdapter,IActualizarPedido actualizarPedido) {


        this.pAdapter = pAdapter;
        pAdapter.setMenu(menu);
        pAdapter.setListener(this);

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
