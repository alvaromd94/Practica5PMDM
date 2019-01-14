package com.alvar.practica5pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Toast extends AppCompatActivity {

    Spinner spinnerHorizontal;
    Spinner spinnerVertical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);


        ArrayAdapter adaptador = ArrayAdapter.createFromResource(this, R.array.alineacionHorizontal,R.layout.support_simple_spinner_dropdown_item);
        final Spinner spinnerHorizontal = findViewById(R.id.spinnerHorizontal);
        spinnerHorizontal.setAdapter(adaptador);

        ArrayAdapter adaptador2 = ArrayAdapter.createFromResource(this, R.array.alineacionVertical,R.layout.support_simple_spinner_dropdown_item);
        final Spinner spinnerVertical = findViewById(R.id.spinnerVertical);
        spinnerVertical.setAdapter(adaptador2);

    }
}
