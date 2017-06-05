package com.jhoann.dell_pc.webservicedatosabiertos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void salir (View view) {
        finish();
    }
}
