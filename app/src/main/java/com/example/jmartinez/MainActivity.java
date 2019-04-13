package com.example.jmartinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0, button_suma, button_resta, button_division, button_multiplicacion, button_igual, button_r;
    Calculadora calculadora;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculadora = new Calculadora();
        button_1 = findViewById(R.id.a);
        button_1.setOnClickListener(this);
        button_2 = findViewById(R.id.b);
        button_2.setOnClickListener(this);
        button_3 = findViewById(R.id.c);
        button_3.setOnClickListener(this);
        button_4 = findViewById(R.id.d);
        button_4.setOnClickListener(this);
        button_5 = findViewById(R.id.e);
        button_5.setOnClickListener(this);
        button_6 = findViewById(R.id.f);
        button_6.setOnClickListener(this);
        button_7 = findViewById(R.id.g);
        button_7.setOnClickListener(this);
        button_8 = findViewById(R.id.h);
        button_8.setOnClickListener(this);
        button_9 = findViewById(R.id.i);
        button_9.setOnClickListener(this);
        button_0 = findViewById(R.id.j);
        button_0.setOnClickListener(this);
        resultado = findViewById(R.id.resultado);


        button_division = findViewById(R.id.division);
        button_division.setOnClickListener(this);
        button_suma = findViewById(R.id.suma);
        button_suma.setOnClickListener(this);
        button_resta = findViewById(R.id.resta);
        button_resta.setOnClickListener(this);
        button_multiplicacion = findViewById(R.id.multiplicacion);
        button_multiplicacion.setOnClickListener(this);


        button_r = findViewById(R.id.r);
        button_r.setOnClickListener(this);
        button_igual = findViewById(R.id.igual);
        button_igual.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a:
                setLabelText(button_1.getText().toString());
                break;
            case R.id.b:
                setLabelText(button_2.getText().toString());
                break;
            case R.id.c:
                setLabelText(button_3.getText().toString());
                break;
            case R.id.d:
                setLabelText(button_4.getText().toString());
                break;
            case R.id.e:
                setLabelText(button_5.getText().toString());
                break;
            case R.id.f:
                setLabelText(button_6.getText().toString());
                break;
            case R.id.g:
                setLabelText(button_7.getText().toString());
                break;
            case R.id.h:
                setLabelText(button_8.getText().toString());
                break;
            case R.id.i:
                setLabelText(button_9.getText().toString());
                break;
            case R.id.j:
                setLabelText(button_0.getText().toString());
                break;
            case R.id.suma:
                sendKeyValue(resultado.getText().toString());
                calculadora.setOperacion(0);
                resultado.setText("");
                break;
            case R.id.resta:
                sendKeyValue(resultado.getText().toString());
                calculadora.setOperacion(1);
                resultado.setText("");
                break;
            case R.id.division:
                sendKeyValue(resultado.getText().toString());
                calculadora.setOperacion(2);
                resultado.setText("");
                break;
            case R.id.multiplicacion:
                sendKeyValue(resultado.getText().toString());
                calculadora.setOperacion(3);
                resultado.setText("");
                break;
            case R.id.igual:
                sendKeyValue(resultado.getText().toString());
                resultado.setText(String.valueOf(calculadora.getResultado()));
                calculadora.resetAll();
                changeInputs(true);
                break;
            case R.id.r:
                resultado.setText("");
                changeInputs(true);
                break;
        }
    }

    public void changeInputs(boolean change) {
        button_suma.setEnabled(change);
        button_resta.setEnabled(change);
        button_division.setEnabled(change);
        button_multiplicacion.setEnabled(change);
    }

    public void setLabelText(String valor) {
        String label = resultado.getText().toString();
        resultado.setText(label + valor);
    }

    public void sendKeyValue(String valor) {
        if (calculadora.getOperacion() != -1) {
            calculadora.setNumero_b(valor);
        } else {
            calculadora.setNumero_a(valor);
            changeInputs(false);
        }
    }
}
