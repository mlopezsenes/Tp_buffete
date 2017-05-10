package com.example.lkdml.tp_buffete.pedido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;

public class pedidos extends AppCompatActivity {

    private ViewManager vm;
    private PedidoController pc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
         this.vm = new ViewManager(this);
        this.pc = vm.getPc();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pedido, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Limpiar:
                this.pc.limpiarPedido();
                return true;
            case R.id.P_enviar:
                this.vm.onClick(this.vm.getActivity().findViewById(R.id.P_enviar));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return true;
    }
}
