package com.example.lkdml.tp_buffete.pedido;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.menu.Menu_model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        Bundle bundle = getIntent().getExtras();
//        ArrayList<Menu_model> pedidos = (ArrayList<Menu_model>) bundle.getSerializable("pedido");
//        Log.d("pedido:",String.valueOf(pedidos.size()));
    }
}
