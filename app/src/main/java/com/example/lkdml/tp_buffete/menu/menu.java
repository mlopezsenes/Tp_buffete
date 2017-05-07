package com.example.lkdml.tp_buffete.menu;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity implements IActualizarPedido{
//    https://developer.android.com/training/implementing-navigation/lateral.html

    private TextView precio;
    private TextView elementos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView rv = (RecyclerView) this.findViewById(R.id.RV_menu);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        MenuAdapter adapter = new MenuAdapter();
        rv.setAdapter(adapter);
        Menu_Controller mc = new Menu_Controller(adapter,this);

        this.precio = (TextView)this.findViewById(R.id.importe);
        this.elementos = (TextView) this.findViewById(R.id.elementos);
    }

    @Override
    public void actualizarPedido(Double precio,int elementos) {
        this.elementos.setText(String.valueOf(elementos));
        this.precio.setText("$ "+String.format("%.2f",precio));
    }
}
