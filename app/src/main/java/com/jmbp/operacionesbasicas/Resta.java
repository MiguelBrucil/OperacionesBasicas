package com.jmbp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {
    EditText ednumRes1,ednumRes2;
    TextView edResultadoRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        ednumRes1=findViewById(R.id.num1Resta);
        ednumRes2=findViewById(R.id.num2Resta);
        edResultadoRes=findViewById(R.id.resResta);
    }
    public void calcularResultado(View v){
        double num1=Double.parseDouble(ednumRes1.getText().toString());
        int num2= Integer.parseInt((ednumRes2.getText().toString()));
        double resultado=num1-num2;
        edResultadoRes.setText(resultado+"");

    }
}