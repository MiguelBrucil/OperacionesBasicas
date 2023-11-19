package com.jmbp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuOperaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_operaciones);

    }
    public void Suma(View v){

        Intent sum=new Intent(this, MainActivity.class);
        startActivity(sum);

    }
    public void resta(View v) {

        Intent res = new Intent(this, Resta.class);
        startActivity(res);
    }
    public void multiplicacion(View v) {

        Intent mul = new Intent(this, Multiplicacion.class);
        startActivity(mul);
    }
    public void division(View v) {

        Intent divi = new Intent(this, Division.class);
        startActivity(divi);
    }
}