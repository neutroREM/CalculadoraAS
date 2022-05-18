package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int resultadoT = 0;
    int inter = 0;
    boolean igual = false;
    boolean suma = false;
    boolean resta = false;
    boolean multipli = false;
    boolean divi = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickuno(View view){
        mostrarDisplay(1);
        resultadoAct(1);
    }

    public void clickdos(View view){
        mostrarDisplay(2);
        resultadoAct(2);
    }

    public void clicktres(View view){
        mostrarDisplay(3);
        resultadoAct(3);
    }

    public void clickcuatro(View view){
        mostrarDisplay(4);
        resultadoAct(4);
    }

    public void clickcinco(View view){
        mostrarDisplay(5);
        resultadoAct(5);
    }

    public void clickseis(View view){
        mostrarDisplay(6);
        resultadoAct(6);
    }

    public void clicksiete(View view){
        mostrarDisplay(7);
        resultadoAct(7);
    }

    public void clickocho(View view){
        mostrarDisplay(8);
        resultadoAct(8);
    }

    public void clicknueve(View view){
        mostrarDisplay(9);
        resultadoAct(9);
    }

    public void clickcero(View view){
        mostrarDisplay(0);
        resultadoAct(0);
    }

    public void clicksuma(View view){
        resultadoT += inter;
            inter = 0;
            TextView display = findViewById(R.id.operacion);
            display.setText("+");
            suma = true;
        Button restar = findViewById(R.id.resta);
        restar.setEnabled(false);
        Button multiplicar = findViewById(R.id.mult);
        multiplicar.setEnabled(false);
        Button dividir = findViewById(R.id.div);
        dividir.setEnabled(false);


    }

    public void clickresta(View view){
        resultadoT -= inter;
            inter = 0;
            TextView display = findViewById(R.id.operacion);
            display.setText("-");
            resta = true;
        Button sumar = findViewById(R.id.suma);
        sumar.setEnabled(false);
        Button multiplicar = findViewById(R.id.mult);
        multiplicar.setEnabled(false);
        Button dividir = findViewById(R.id.div);
        dividir.setEnabled(false);
    }

    public void clickmult(View view){
        resultadoT = resultadoT * inter;
            inter = 0;
            TextView display = findViewById(R.id.operacion);
            display.setText("*");
            multipli = true;
        Button sumar = findViewById(R.id.suma);
        sumar.setEnabled(false);
        Button restar = findViewById(R.id.resta);
        restar.setEnabled(false);
        Button dividir = findViewById(R.id.div);
        dividir.setEnabled(false);
    }

    public void clickdiv(View view){
        resultadoT = resultadoT / inter;
            inter = 0;
            TextView display = findViewById(R.id.operacion);
            display.setText("-");
            divi = true;
        Button restar = findViewById(R.id.resta);
        restar.setEnabled(false);
        Button multiplicar = findViewById(R.id.mult);
        multiplicar.setEnabled(false);
        Button sumar = findViewById(R.id.suma);
        sumar.setEnabled(false);
    }


    public void clickresult(View view){
        TextView display = findViewById(R.id.operacion);

        if (suma){
            resultadoT += inter;
        }

        if(resta){
            resultadoT = resultadoT - inter;
        }

        if (multipli){
            resultadoT = resultadoT * inter;
        }
        if (divi){
            resultadoT = resultadoT / inter;
        }



        String aux = ""+resultadoT;
        display.setText(aux);


        inter = 0;
        suma = false;
        resta = false;
        multipli = false;
        divi = false;


        Button sumar = findViewById(R.id.suma);
        sumar.setEnabled(true);
        Button restar = findViewById(R.id.resta);
        restar.setEnabled(true);
        Button multiplicar = findViewById(R.id.mult);
        multiplicar.setEnabled(true);
        Button dividir = findViewById(R.id.div);
        dividir.setEnabled(true);
    }

    public void clickreset(View view){
        TextView display = findViewById(R.id.operacion);
        display.setText("");
        inter = 0;
        resultadoT = 0;

        suma = false;
        resta = false;
        multipli = false;
        divi = false;

        Button sumar = findViewById(R.id.suma);
        sumar.setEnabled(true);
        Button restar = findViewById(R.id.resta);
        restar.setEnabled(true);
        Button multiplicar = findViewById(R.id.mult);
        multiplicar.setEnabled(true);
        Button dividir = findViewById(R.id.div);
        dividir.setEnabled(true);
    }




    public void mostrarDisplay(int digito){

        TextView display = findViewById(R.id.operacion);
        String vistaAnterior = display.getText().toString();

        if ((vistaAnterior == "0") || (vistaAnterior == "") || igual){
            if (digito != 0){
                display.setText("" + digito);
            }
            else display.setText("0");
        }
        else{
            String digitoDisplay = vistaAnterior + digito;
            display.setText(digitoDisplay);
        }
        igual = false;
    }

    public void resultadoAct (int digito)
    {
        inter = (inter * 10) + digito;
    }

}