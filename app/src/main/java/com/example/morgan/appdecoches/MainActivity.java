package com.example.morgan.appdecoches;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  {

    //Declaro todas las variables de tipo ImageBotton con los respectivos nombres
    ImageButton btnBuagatti, btnCadillac, btnChevrolet, btnDodge, btnDodgeViper, btnLexus, btnMorgan, btnMustang, btnSmart, btnTesla;

    //Creamos el bundle para meter dentro que boton han pulsado
    Bundle b = new Bundle();

    //Crea esta variable aqui para que sea accesible por varias metodos
    String coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hago el casting para relacionar todos los objetos con su view en la activity
        btnBuagatti = (ImageButton) findViewById(R.id.imageButtonBugatti);
        btnCadillac = (ImageButton) findViewById(R.id.imageButtonCadillac);
        btnChevrolet = (ImageButton) findViewById(R.id.imageButtonChevrolet);
        btnDodge = (ImageButton) findViewById(R.id.imageButtonDodge);
        btnDodgeViper = (ImageButton) findViewById(R.id.imageButtonDodgeViper);
        btnLexus = (ImageButton) findViewById(R.id.imageButtonLexus);
        btnMorgan = (ImageButton) findViewById(R.id.imageButtonMorgan);
        btnMustang = (ImageButton) findViewById(R.id.imageButtonMustang);
        btnSmart = (ImageButton) findViewById(R.id.imageButtonSmart);
        btnTesla = (ImageButton) findViewById(R.id.imageButtonTesla);


        /*
        //Cremos los listener para cada boton para luego poder haver un switch
        btnBuagatti.setOnClickListener(this);
        btnCadillac.setOnClickListener(this);
        btnChevrolet.setOnClickListener(this);
        btnDodge.setOnClickListener(this);
        btnDodgeViper.setOnClickListener(this);
        btnLexus.setOnClickListener(this);
        btnMorgan.setOnClickListener(this);
        btnMustang.setOnClickListener(this);
        btnSmart.setOnClickListener(this);
        btnTesla.setOnClickListener(this);
        */

    }

    public void btnBugatti(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "bugatti";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnCadillac(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "cadillac";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }


    public void btnChevrolet(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "chevrolet";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnDodge(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "dodge";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnDodgeViper(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "dodgeViper";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnLexus(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "lexus";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnMorgan(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "morgan";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnMustang(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "musang";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnSmart(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "smart";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnTesla(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "tesla";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);

    }

    public void enviar (Bundle b)
    {
        //Creamos un objeto del tipo Intent, que sirve para ir de una activity a otra
        //diciendo primero donde estamos y despues de la coma, donde queremos ir
        Intent intencion = new Intent(MainActivity.this, MainActivity2.class);

        //Le añadimos al Intent que lleve con sigo el Bundle que lleva los datos que hemos guardado
        intencion.putExtras(b);

        //Activamos el Intent
        startActivity(intencion);
    }

    /*public void onClick(View v)
    {

    }*/

}
