package com.example.morgan.appdecoches;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  {

    //Declaro todas las variables de tipo ImageBotton con los respectivos nombres
    ImageButton btnBentley, btnBuagatti, btnCadillac, btnChevrolet, btnDodge,  btnLexus, btnMcLaren, btnMorgan, btnSubaru, btnTesla;

    //Declaro el boton que usare para iniciar el juego
    Button btnJuego;

    //Creamos el bundle para meter dentro que boton han pulsado
    Bundle b = new Bundle();

    //Crea esta variable aqui para que sea accesible por varias metodos
    String coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hago el casting para relacionar todos los objetos con su view en la activity
        btnBentley = (ImageButton) findViewById(R.id.imageButtonBentley);
        btnBuagatti = (ImageButton) findViewById(R.id.imageButtonBugatti);
        btnCadillac = (ImageButton) findViewById(R.id.imageButtonCadillac);
        btnChevrolet = (ImageButton) findViewById(R.id.imageButtonChevrolet);
        btnDodge = (ImageButton) findViewById(R.id.imageButtonDodge);
        btnLexus = (ImageButton) findViewById(R.id.imageButtonLexus);
        btnMcLaren = (ImageButton) findViewById(R.id.imageButtonMcLaren);
        btnMorgan = (ImageButton) findViewById(R.id.imageButtonMorgan);
        btnSubaru = (ImageButton) findViewById(R.id.imageButtonSubaru);
        btnTesla = (ImageButton) findViewById(R.id.imageButtonTesla);

        btnJuego = (Button)findViewById(R.id.buttonJugar);
    }

    public void btnBentley(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "bentley";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
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

    public void btnLexus(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "lexus";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    public void btnMcLaren(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "mclaren";

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

    public void btnSubaru(View v)
    {
        //Creamos una vatiable para decir que coche han escogido y luego ponerlo en el bundle
        coche = "subaru";

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

    public void juego (View v)
    {
        //Creo la variable para decir que el juego a empezado
        coche = "juego";

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putString("coche", coche.toString());

        enviar(b);
    }

    //Este metodo recibe el bundle de los otros metodos y activa
    // un Intent para ir a la otra activity
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








}
