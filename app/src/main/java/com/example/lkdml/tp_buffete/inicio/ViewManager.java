package com.example.lkdml.tp_buffete.inicio;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.menu.Menues;
import com.example.lkdml.tp_buffete.registro.Registro_Usuario;

/**
 * Created by lkdml on 8/5/2017.
 */

public class ViewManager implements View.OnClickListener {

    private Activity activity;
    private TextView mail;
    private TextView clave;
    private Button ingresar;
    private Button registrarme;


    public ViewManager(Activity activity) {
        this.activity = activity;
        this.mail = (TextView) this.activity.findViewById(R.id.IL_Mail);
        this.clave = (TextView) this.activity.findViewById(R.id.IL_Clave);
        this.ingresar = (Button) this.activity.findViewById(R.id.IL_LogIn);
        this.registrarme = (Button) this.activity.findViewById(R.id.IL_Registro);
        this.ingresar.setOnClickListener(this);
        this.registrarme.setOnClickListener(this);
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }


    @Override
    public void onClick(View v) {
        if (this.registrarme.getId() == v.getId()){
            Intent i = new Intent(activity, Registro_Usuario.class);
            activity.startActivity(i);
        } else if (this.ingresar.getId() == v.getId()){
            Intent i = new Intent(activity, Menues.class);
            activity.startActivity(i);
        }

    }
}
