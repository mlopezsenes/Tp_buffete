package com.example.lkdml.tp_buffete.registro;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lkdml.tp_buffete.R;
import com.example.lkdml.tp_buffete.inicio.Inicio_Login;

/**
 * Created by lkdml on 8/5/2017.
 */

public class ViewManager implements View.OnClickListener{

    private Activity activity;
    private TextView nombre;
    private TextView apellido;
    private TextView dni;
    private TextView mail;
    private TextView clave;
    private TextView clave2;
    private Button registrarme;


    public ViewManager(Activity activity) {
        this.activity = activity;
        this.mail = (TextView) this.activity.findViewById(R.id.RU_Mail);
        this.clave = (TextView) this.activity.findViewById(R.id.RU_Pass1);
        this.clave2 = (TextView) this.activity.findViewById(R.id.RU_pass2);
        this.nombre = (TextView) this.activity.findViewById(R.id.RU_Name);
        this.apellido = (TextView) this.activity.findViewById(R.id.RU_LastName);
        this.dni = (TextView) this.activity.findViewById(R.id.RU_DNI);
        this.registrarme = (Button)this.activity.findViewById(R.id.RU_registro);
        this.registrarme.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        if (this.registrarme.getId() == v.getId()){
            Intent i = new Intent(activity, Inicio_Login.class);
            activity.startActivity(i);
        }

    }
}
