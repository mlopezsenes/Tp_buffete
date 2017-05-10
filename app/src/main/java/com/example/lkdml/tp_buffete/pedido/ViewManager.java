package com.example.lkdml.tp_buffete.pedido;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.Menu_model;
import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.menu.IActualizarPedido;
import com.example.lkdml.tp_buffete.menu.MenuAdapter;
import com.example.lkdml.tp_buffete.menu.MenuController;

import java.util.ArrayList;

/**
 * Created by lkdml on 8/5/2017.
 */

public class ViewManager implements View.OnClickListener , IActualizarPedidos,DialogInterface.OnClickListener {
    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private Activity activity;
    private TextView precio;
    private TextView elementos;
    private Button enviarPedido;
    private PedidoController pc;
    private PedidoAdapter adapter;


    public ViewManager(Activity activity) {
        this.activity = activity;
        RecyclerView rv = (RecyclerView) this.activity.findViewById(R.id.RV_pedido);

        LinearLayoutManager lm = new LinearLayoutManager(activity);
        rv.setLayoutManager(lm);

        this.adapter = new PedidoAdapter();
        rv.setAdapter(adapter);
        this.pc = new PedidoController(adapter,this);

        this.precio = (TextView)this.activity.findViewById(R.id.P_importe);
        this.elementos = (TextView) this.activity.findViewById(R.id.P_elementos);
        this.enviarPedido = (Button)this.activity.findViewById(R.id.P_enviar);
        this.enviarPedido.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Dialogo dialogo = new Dialogo();
        dialogo.setTitulo("Estado del mensaje");
        dialogo.setMensaje("El pedido fue enviado correctamente");
        dialogo.setListener(this);
        this.pc.limpiarPedido();
        dialogo.show(this.activity.getFragmentManager(),"dialogo");
        Log.d("pase x aca", "si pase");
    }
    @Override
    public void actualizarPedido(Double precio,int elementos) {
        this.elementos.setText(String.valueOf(elementos));
        this.precio.setText(String.format("$ %.2f",precio));
        this.adapter.notifyDataSetChanged();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        Log.d("dialog","Click!"+String.valueOf(which));
    }


    public PedidoController getPc() {
        return pc;
    }

    public void setPc(PedidoController pc) {
        this.pc = pc;
    }
}
