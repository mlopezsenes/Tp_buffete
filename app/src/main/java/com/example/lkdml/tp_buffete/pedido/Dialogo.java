package com.example.lkdml.tp_buffete.pedido;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by lkdml on 9/5/2017.
 */

public class Dialogo extends DialogFragment {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public DialogInterface.OnClickListener getListener() {
        return listener;
    }

    public void setListener(DialogInterface.OnClickListener listener) {
        this.listener = listener;
    }

    private String titulo;
    private String mensaje;
    private DialogInterface.OnClickListener listener;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder constructor = new AlertDialog.Builder(getActivity());
        constructor.setTitle(titulo);
        constructor.setMessage(mensaje);
        constructor.setPositiveButton("OK",this.listener);
        AlertDialog ad = constructor.create();
        return ad;
    }
}
