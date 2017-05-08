package com.example.lkdml.tp_buffete.registro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lkdml.tp_buffete.R;

public class Registro_Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__usuario);
        ViewManager vm = new ViewManager(this);
    }
}
