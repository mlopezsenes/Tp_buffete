package com.example.lkdml.tp_buffete.pedido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;

public class pedidos extends AppCompatActivity implements IActualizarPedidos {
    private TextView precio;
    private TextView elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        RecyclerView rv = (RecyclerView) this.findViewById(R.id.RV_menu);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        PedidoAdapter adapter = new PedidoAdapter();
        rv.setAdapter(adapter);
//        PedidoController pc = new PedidoController(adapter,this);

        this.precio = (TextView)this.findViewById(R.id.importe);
        this.elementos = (TextView) this.findViewById(R.id.elementos);
    }


    @Override
    public void actualizarPedido(Double precio, int elementos) {
        this.elementos.setText(String.valueOf(elementos));
        this.precio.setText("$ "+String.format("%.2f",precio));
    }
}
