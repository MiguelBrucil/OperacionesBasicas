package com.jmbp.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ednum1,ednum2;
TextView edResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednum1=findViewById(R.id.numNumero1);
        ednum2=findViewById(R.id.numNumero2);
        edResultado=findViewById(R.id.numRespuesta);

    }
    public void calcularResultado(View v){
        double num1=Double.parseDouble(ednum1.getText().toString());
        int num2= Integer.parseInt((ednum2.getText().toString()));
        double resultado=num1+num2;
        edResultado.setText(resultado+"");

    }
}