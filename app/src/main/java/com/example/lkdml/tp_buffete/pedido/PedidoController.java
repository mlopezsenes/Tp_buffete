package com.example.lkdml.tp_buffete.pedido;

import android.util.Log;


import com.example.lkdml.tp_buffete.Menu_model;
import com.example.lkdml.tp_buffete.menu.IActualizarPedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lkdml on 7/5/2017.
 */

public class PedidoController implements IPedidoItemClick {

    private List<Menu_model> pedidos;
    private PedidoAdapter pAdapter;
    private IActualizarPedidos actualizarPedido;

    public ViewManager getVm() {
        return vm;
    }

    public void setVm(ViewManager vm) {
        this.vm = vm;
    }

    private ViewManager vm;

    public PedidoController(PedidoAdapter pAdapter,IActualizarPedidos actualizarPedido) {
        this.pedidos = new ArrayList<Menu_model>();
        pedidos.add(new Menu_model("Producto 01",2.4));
        pedidos.add(new Menu_model("Producto 02",2.4));
        pedidos.add(new Menu_model("Producto 03",2.4));
        pedidos.add(new Menu_model("Producto 04",2.4));
        pedidos.add(new Menu_model("Producto 05",2.4));

        this.pAdapter = pAdapter;
        this.pAdapter.setPedidos(this.pedidos);
        this.pAdapter.setListener(this);

        this.actualizarPedido = actualizarPedido;

    }

    @Override
    public void onItemClick(int position) {
        Log.d("Se hace click en:", "la posision "+ String.valueOf(position));
        this.pedidos.remove(position);
        this.actualizarPedido.actualizarPedido(this.calcularPrecio(pedidos),pedidos.size());
    }

    private void agregarPedido(int position){
        this.pedidos.add(pedidos.get(position));
    }

    private Double calcularPrecio(List<Menu_model> pedido){
        Double precio = 0.0;
        for (Menu_model item: pedido ) {
            precio += item.getPrecio();

        }
        return precio;
    }


    public List<Menu_model> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Menu_model> pedidos) {
        this.pedidos = pedidos;
    }

    public void limpiarPedido (){
        pedidos.clear();
        this.actualizarPedido.actualizarPedido(calcularPrecio(this.pedidos),pedidos.size());
    }

}
