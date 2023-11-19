package com.jmbp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {
    EditText ednum1Divi,ednum2Divi;
    TextView edResultadoDivi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        ednum1Divi=findViewById(R.id.num1Divi);
        ednum2Divi=findViewById(R.id.num2Divi);
        edResultadoDivi=findViewById(R.id.resDivi);
    }
    public void calcularResultadoDivision(View v){
        double num1=Double.parseDouble(ednum1Divi.getText().toString());
        int num2= Integer.parseInt((ednum2Divi.getText().toString()));
        double resultado=num1/num2;
        edResultadoDivi.setText(resultado+"");

    }
}