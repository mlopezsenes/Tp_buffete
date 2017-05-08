package com.example.lkdml.tp_buffete.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.pedido.Pedido;

import java.util.ArrayList;

/**
 * Created by lkdml on 8/5/2017.
 */

public class ViewManager implements View.OnClickListener , IActualizarPedido{
    private Activity activity;
    private TextView precio;
    private TextView elementos;
    private Button registrarme;
    private MenuController mc;


    public ViewManager(Activity activity) {
        this.activity = activity;
        RecyclerView rv = (RecyclerView) this.activity.findViewById(R.id.RV_menu);

        LinearLayoutManager lm = new LinearLayoutManager(activity);
        rv.setLayoutManager(lm);

        MenuAdapter adapter = new MenuAdapter();
        rv.setAdapter(adapter);
        this.mc = new MenuController(adapter,this);

        this.precio = (TextView)this.activity.findViewById(R.id.importe);
        this.elementos = (TextView) this.activity.findViewById(R.id.elementos);
        this.registrarme = (Button)this.activity.findViewById(R.id.MNU_VerPedido);
        this.registrarme.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (this.registrarme.getId() == v.getId()){
            Intent i = new Intent(activity, Pedido.class);
            Bundle bundle = new Bundle();
            ArrayList<Menu_model> pedidos = this.mc.getPedidos();
            bundle.putSerializable("pedido",  pedidos);
            activity.startActivity(i);
        }

    }
    @Override
    public void actualizarPedido(Double precio,int elementos) {
        this.elementos.setText(String.valueOf(elementos));
        this.precio.setText("$ "+String.format("%.2f",precio));
    }
}
