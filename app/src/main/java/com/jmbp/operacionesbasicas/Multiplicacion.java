package com.jmbp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacion extends AppCompatActivity {
    EditText ednumMul1,ednumMul2;
    TextView edResultadoMul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        ednumMul1=findViewById(R.id.num1Multi);
        ednumMul2=findViewById(R.id.num2Multi);
        edResultadoMul=findViewById(R.id.resMulti);
    }
    public void calcularResultadoMulti(View v){
        double num1=Double.parseDouble(ednumMul1.getText().toString());
        int num2= Integer.parseInt((ednumMul2.getText().toString()));
        double resultado=num1*num2;
        edResultadoMul.setText(resultado+"");

    }
}