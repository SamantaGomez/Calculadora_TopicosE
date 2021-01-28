package com.example.calculadorasgomez;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // variables
    boolean in = false;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean divide = false;
    boolean exp  = false;
    boolean ra = false;
    boolean targ = false;
    boolean cos = false;
    boolean se = false;
    boolean log = false;
    boolean porc = false;

    Double[] numero = new Double [20];
    Double resultado ;

    // sonido
    public MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //navbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.img);

        sonido= MediaPlayer.create(this, R.raw.btnprs);

        // llamar botones de numeros
        Button n0 = (Button) findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        // llamar operaciones
        Button punto = (Button) findViewById(R.id.btnpunto);
        punto.setOnClickListener(this);
        Button igual = (Button) findViewById(R.id.btnigual);
        igual.setOnClickListener(this);
        Button raiz = (Button) findViewById(R.id.btnraiz);
        raiz.setOnClickListener(this);
        Button sumar = (Button) findViewById(R.id.btnsumar);
        sumar.setOnClickListener(this);
        Button restar = (Button) findViewById(R.id.btnrestar);
        restar.setOnClickListener(this);
        Button dividir = (Button) findViewById(R.id.btndividir);
        dividir.setOnClickListener(this);
        Button multiplicar = (Button) findViewById(R.id.btnmulti);
        multiplicar.setOnClickListener(this);
        Button borrar = (Button) findViewById(R.id.btnBorrar);
        borrar.setOnClickListener(this);
        Button exp = (Button) findViewById(R.id.btnExp);
        exp.setOnClickListener(this);
        Button seno = (Button) findViewById(R.id.btnseno);
        seno.setOnClickListener(this);
        Button coseno = (Button) findViewById(R.id.btncoseno);
        coseno.setOnClickListener(this);
        Button targente = (Button) findViewById(R.id.btnTargente);
        targente.setOnClickListener(this);
        Button delete = (Button) findViewById(R.id.btndelete);
        delete.setOnClickListener(this);
        Button pocentaje = (Button) findViewById(R.id.btnporcentaje);
        pocentaje.setOnClickListener(this);
        Button log = (Button) findViewById(R.id.btnLog);
        log.setOnClickListener(this);;
        Button in = (Button) findViewById(R.id.btnIn);
        in.setOnClickListener(this);

    }
    //funciones para operaciones
    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();
        try {
            switch (seleccion) {
                case R.id.btn0:
                    sonido.start();
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    sonido.start();
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    sonido.start();
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    sonido.start();
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    sonido.start();
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    sonido.start();
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    sonido.start();
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    sonido.start();
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    sonido.start();
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    sonido.start();
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnLog:
                    sonido.start();
                    log = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log10(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnIn:
                    sonido.start();
                    in = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal=false;
                    break;
                case R.id.btnBorrar:
                    sonido.start();
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btncoseno:
                    sonido.start();
                    cos=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.cos(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btndelete:
                    sonido.start();
                    String cadena = a.substring(0, a.length() - 1);
                    pantalla.setText(cadena);
                    break;
                case R.id.btndividir:
                    sonido.start();
                    divide = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnExp:
                    sonido.start();
                    exp=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnigual:
                    sonido.start();
                    numero[1]= Double.parseDouble(a);
                    if(suma == true) {
                        resultado = numero[0]+ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (resta == true){
                        resultado = numero[0]- numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (multi == true){
                        resultado = numero[0]* numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (divide == true){
                        resultado = numero[0]/ numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (porc == true){
                        resultado=(numero[0]*100)/numero[1];
                        pantalla.setText(String.valueOf( resultado));
                    }   else if (exp == true){
                        resultado = Math.pow(numero[0],numero[1]);
                        pantalla.setText(String.valueOf( resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multi = false;
                    divide = false;
                    exp  = false;
                    ra = false;
                    targ = false;
                    cos = false;
                    se = false;
                    log = false;
                    porc = false;
                    in = false;
                    break;
                case R.id.btnmulti:
                    sonido.start();
                    multi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnpunto:
                    sonido.start();
                    pantalla.setText(a+".");
                    decimal = true;
                    if(decimal == false){
                        pantalla.setText(a+".");
                    }else{
                        return;
                    }
                    break;
                case R.id.btnraiz:
                    sonido.start();
                    ra = true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sqrt(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal=false;
                    break;
                case R.id.btnrestar:
                    sonido.start();
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnseno:
                    sonido.start();
                    se=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.sin(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
                case R.id.btnporcentaje:
                    sonido.start();
                    porc=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = numero[0]/100;
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.btnsumar:
                    sonido.start();
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnTargente:
                    sonido.start();
                    targ=true;
                    numero[0]=Double.parseDouble(a);
                    pantalla.setText("");
                    resultado=Math.tan(numero[0]);
                    pantalla.setText(String.valueOf( resultado));
                    decimal = false;
                    break;
            }
        }catch(Exception e){
            pantalla.setText(" Error");
        };
    }
}