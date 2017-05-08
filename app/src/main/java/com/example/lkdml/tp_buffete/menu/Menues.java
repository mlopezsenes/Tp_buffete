package com.example.lkdml.tp_buffete.menu;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lkdml.tp_buffete.R;


public class Menues extends AppCompatActivity {
//    https://developer.android.com/training/implementing-navigation/lateral.html

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ViewManager vm = new ViewManager(this);

    }


}
