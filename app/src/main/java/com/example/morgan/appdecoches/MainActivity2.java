package com.example.morgan.appdecoches;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.holo_red_dark;

public class MainActivity2 extends Activity implements View.OnClickListener {

    //Declaro las variables con las que identificare cada elemento
    EditText editTextMarca;
    EditText editTextFundador;
    EditText editTextFundacion;
    EditText editTextModelo;
    TextView textViewLink;
    ImageView imageViewCoche;
    Button buttonComprobar, buttonSiguiente, buttonSalir;

    int array[];

    int contadorPreguntas=0;

    int contadorAciertos=0;

    int numeroCoche=-1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Hago el casting para relacionar los objetos creados aqui con los de la activity
        editTextMarca = (EditText) findViewById(R.id.editTextMarca);
        editTextFundador = (EditText) findViewById(R.id.editTextFundador);
        editTextFundacion = (EditText) findViewById(R.id.editTextFundacion);
        editTextModelo = (EditText) findViewById(R.id.editTextModelo);

        textViewLink = (TextView) findViewById(R.id.textViewLink);

        imageViewCoche = (ImageView) findViewById(R.id.imageViewCoche);


        //Creo los setOnClickLiester para los 3 botones del juego
        buttonComprobar = (Button) findViewById(R.id.buttonComprobar);
        buttonComprobar.setOnClickListener(this);

        buttonSiguiente = (Button) findViewById(R.id.buttonSiguiente);
        buttonSiguiente.setOnClickListener(this);

        buttonSalir = (Button) findViewById(R.id.buttonSalir);
        buttonSalir.setOnClickListener(this);


        //Inicializo la array y el contador que usare en el juego
        array = new int[10];
        contadorPreguntas=0;
        contadorAciertos=0;

        //Creamos un bundle y preguntamos si el Intent de la llamada lleva algo
        //en el intent
        Bundle b = getIntent().getExtras();


        //Hacemos un switch para que saber que boton al pulsado y dependiendo
        // de cual sea mostrar una imagen o otra
        switch (b.getString("coche")) {
            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "bentley":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Bentley");
                editTextFundador.setText("Walter Bentley");
                editTextFundacion.setText("1919");
                editTextModelo.setText("Continental GT3-R");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.bentley_continental_gt3_r);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.bentleymotors.com/en.html");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bentleymotors.com/en.html"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "bugatti":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Bugatti");
                editTextFundador.setText("Ettore Bugatti");
                editTextFundacion.setText("1909");
                editTextModelo.setText("Chiron");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.bugatti_chiron);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.bugatti.com/home/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bugatti.com/home/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "cadillac":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Cadillac");
                editTextFundador.setText("Henry Ford");
                editTextFundacion.setText("1902");
                editTextModelo.setText("Eldorado Brougham");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.cadillac_eldorado_brougham);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.cadillac.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cadillac.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "chevrolet":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Chevrolet");
                editTextFundador.setText("Luis Chevrolet");
                editTextFundacion.setText("1911");
                editTextModelo.setText("Camaro");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.chevrolet_camaro);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.chevrolet.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://es.chevrolet.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "dodge":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Dodge");
                editTextFundador.setText("John Dodge");
                editTextFundacion.setText("1914");
                editTextModelo.setText("Challenger");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.dodge_challenger);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.dodge.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://es.dodge.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "lexus":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Lexus");
                editTextFundador.setText("Eiji Toyoda");
                editTextFundacion.setText("1989");
                editTextModelo.setText("LFA");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.lexus_lfa);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.lexus.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lexus.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "mclaren":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("McLaren");
                editTextFundador.setText("Ron Dennis");
                editTextFundacion.setText("1989");
                editTextModelo.setText("P1");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.mclaren_p1);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://cars.mclaren.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cars.mclaren.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "morgan":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Morgan");
                editTextFundador.setText("H.F.S. Morgan");
                editTextFundacion.setText("1910");
                editTextModelo.setText("Aero 8");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.morgan_aero8);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.morgan-motor.co.uk/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.morgan-motor.co.uk/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "subaru":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Subaru");
                editTextFundador.setText("Chikuhei Nakajima");
                editTextFundacion.setText("1953");
                editTextModelo.setText("BRZ");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.subaru_brz);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.subaru.jp/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.subaru.jp/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case "tesla":

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("Tesla");
                editTextFundador.setText("Elon Musk");
                editTextFundacion.setText("2003");
                editTextModelo.setText("Roadster");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.tesla_roadster);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("https://www.tesla.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tesla.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            case "juego":

                //Hago visible los botones
                buttonComprobar.setVisibility(View.VISIBLE);
                buttonSiguiente.setVisibility(View.VISIBLE);
                buttonSalir.setVisibility(View.VISIBLE);

                //Llamamos a este metodo para que genere en una array numero aleatorios sin repetirse
                numeroAleatorio();

                break;
        }

    }



    //Este metodo genera en una array numero aleatorios sin repetirse
    public void numeroAleatorio() {
        //Empezaremos creando una array de 10 posiciones que guarde en una
        // array 10 numero sin repetirse que seran los 10 posibles coches que saldran
        int i = 0, j = 0, cantidad = 10, rango = 10;

        //En esta array guardaremos 10 numero del 0 al 9 y no se repetira ninguno


        array[i] = (int) (Math.random() * rango);

        for (i = 1; i < cantidad; i++) {
            array[i] = (int) (Math.random() * rango);

            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }
        }


        //Activo los editText para que puedan escribir
        /*editTextMarca.setFocusable(true);
        editTextFundador.setFocusable(true);
        editTextFundacion.setFocusable(true);
        editTextModelo.setFocusable(true);*/


        //Llamamos al metodo que mostrara las preguntas
        mostrarPregunta();
    }


    //ESTA FUNCION ES LA QUE MUESTRA UNA PANTALLA O OTRA SEGUN EL NUMERO QUE LE LLEGUE
    public void mostrarPregunta() {
        switch (array[contadorPreguntas]) {
            case 0:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 0;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.bentley_continental_gt3_r);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.bentleymotors.com/en.html");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bentleymotors.com/en.html"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 1:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 1;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.bugatti_chiron);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.bugatti.com/home/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bugatti.com/home/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 2:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 2;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.cadillac_eldorado_brougham);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.cadillac.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cadillac.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 3:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 3;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.chevrolet_camaro);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.chevrolet.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://es.chevrolet.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 4:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 4;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.dodge_challenger);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.dodge.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://es.dodge.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 5:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 5;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.lexus_lfa);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.lexus.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lexus.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 6:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 6;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.mclaren_p1);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://cars.mclaren.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cars.mclaren.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 7:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 7;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.morgan_aero8);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.morgan-motor.co.uk/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.morgan-motor.co.uk/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 8:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 8;

                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.subaru_brz);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.subaru.jp/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.subaru.jp/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;

            //En el caso de que sea bugatti rellenaremos los editText con la informacion que corresponda
            case 9:

                //DIGO EL NUMERO DE ESTE COCHE
                numeroCoche = 9;
                //Rellenamos los editText que corresponde con este caso
                editTextMarca.setText("");
                editTextFundador.setText("");
                editTextFundacion.setText("");
                editTextModelo.setText("");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.tesla_roadster);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("https://www.tesla.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tesla.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
        }
    }


    //Este evento controlara los tres botones de comprobar, siguiente y salir
    @Override
    public void onClick(View v)
    {

        //Hacemos un switch para saber a que boton le han dado
        switch (v.getId())
        {

            /////Hacemos el caso del boton COMPROBAR
            case R.id.buttonComprobar:

                //Comprueblo si lo que han escrito es correcto y coincide con el coche Bentley")("Walter Bentley")("1919")("Continental GT3-R");  0
                if (editTextMarca.getText().toString().equals("bentley") && numeroCoche == 0)
                {

                    editTextMarca.setTextColor(Color.GREEN);
                }
                else if (!editTextMarca.getText().toString().equals("bentley") && numeroCoche == 0)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("walter bentley") && numeroCoche == 0)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("walter bentley") && numeroCoche == 0)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1919") && numeroCoche == 0)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);

                }
                else if (!editTextFundacion.getText().toString().equals("1919") && numeroCoche == 0)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("continental gt3-r") && numeroCoche == 0)
                {


                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("continental gt3-r") && numeroCoche == 0)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el segundo coche BUGATTI ("Bugatti")("Ettore Bugatti")("1909")("Chiron")   1
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("bugatti") && numeroCoche == 1)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("bugatti") && numeroCoche == 1)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("ettore bugatti") && numeroCoche == 1)
                {


                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);

                }
                else if (!editTextFundador.getText().toString().equals("ettore bugatti") && numeroCoche == 1)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1909") && numeroCoche == 1)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);

                }
                else if (!editTextFundacion.getText().toString().equals("1909") && numeroCoche == 1)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("chiron") && numeroCoche == 1)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);

                }
                else if (!editTextModelo.getText().toString().equals("chiron") && numeroCoche == 1)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el tercer coche Cadillac");Henry Ford");1902.");Eldorado Brougham" numero 2
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("cadillac") && numeroCoche == 2)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);

                }
                else if (!editTextMarca.getText().toString().equals("cadillac") && numeroCoche == 2)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("henry ford") && numeroCoche == 2)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("henry ford") && numeroCoche == 2)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1902") && numeroCoche == 2)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);

                }
                else if (!editTextFundacion.getText().toString().equals("1902") && numeroCoche == 2)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("eldorado brougham") && numeroCoche == 2)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("eldorado brougham") && numeroCoche == 2)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el cuarto coche ("Chevrolet")("Luis Chevrolet")("1911")("Camaro") numero 3
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("chevrolet") && numeroCoche == 3)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);

                }
                else if (!editTextMarca.getText().toString().equals("chevrolet") && numeroCoche == 3)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("luis chevrolet") && numeroCoche == 3)
                {
                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);

                }
                else if (!editTextFundador.getText().toString().equals("luis chevrolet") && numeroCoche == 3)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1911") && numeroCoche == 3)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);

                }
                else if (!editTextFundacion.getText().toString().equals("1911") && numeroCoche == 3)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("camaro") && numeroCoche == 3)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);

                }
                else if (!editTextModelo.getText().toString().equals("camaro") && numeroCoche == 3)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el quinto coche ("Dodge")("John Dodge")("1914")("Challenger") numero 4
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("dodge") && numeroCoche == 4)
                {
                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("dodge") && numeroCoche == 4)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("john dodge") && numeroCoche == 4)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("john dodge") && numeroCoche == 4)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1914") && numeroCoche == 4)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("1914") && numeroCoche == 4)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("challenger") && numeroCoche == 4)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("challenger") && numeroCoche == 4)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el sexto coche ("Lexus")("Eiji Toyoda")("1989")("LFA")   numero 5
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("lexus") && numeroCoche == 5)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("lexus") && numeroCoche == 5)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("eiji toyoda") && numeroCoche == 5)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("eiji toyoda") && numeroCoche == 5)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1989") && numeroCoche == 5)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("1989") && numeroCoche == 5)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("lfs") && numeroCoche == 5)
                {
                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("lfa") && numeroCoche == 5)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el septimo coche ("McLaren")("Ron Dennis")("1989")("P1")   numero 6
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("mclaren") && numeroCoche == 6)
                {
                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("mclaren") && numeroCoche == 6)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("ron dennis") && numeroCoche == 6)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("ron dennis") && numeroCoche == 6)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1989") && numeroCoche == 6)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("1989") && numeroCoche == 6)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("p1") && numeroCoche == 6)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("p1") && numeroCoche == 6)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el octabo coche ("Morgan")("H.F.S. Morgan")("1910")("Aero 8")   numero 7
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("morgan") && numeroCoche == 7)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("morgan") && numeroCoche == 7)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("h.f.s. morgan") && numeroCoche == 7)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("h.f.s. morgan") && numeroCoche == 7)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1910") && numeroCoche == 7)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("1910") && numeroCoche == 7)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("aero 8") && numeroCoche == 7)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("aero 8") && numeroCoche == 7)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el noveno coche ("Subaru")("Chikuhei Nakajima")("1953")("BRZ")  numero 8
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("subaru") && numeroCoche == 8)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("subaru") && numeroCoche == 8)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("chikuhei nakajima") && numeroCoche == 8)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);


                }
                else if (!editTextFundador.getText().toString().equals("chikuhei nakajima") && numeroCoche == 8)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1953") && numeroCoche == 8)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("1953") && numeroCoche == 8)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("brz") && numeroCoche == 8)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);

                }
                else if (!editTextModelo.getText().toString().equals("brz") && numeroCoche == 8)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }



                //////////////Ahora compruebo el el decimo coche ("Tesla")("Elon Musk")("2003")("Roadster")  numero 9
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("tesla") && numeroCoche == 9)
                {

                    //El edit text para decir que es correcto
                    editTextMarca.setTextColor(Color.GREEN);


                }
                else if (!editTextMarca.getText().toString().equals("tesla") && numeroCoche == 9)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextMarca.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("elon musk") && numeroCoche == 9)
                {

                    //El edit text para decir que es correcto
                    editTextFundador.setTextColor(Color.GREEN);

                }
                else if (!editTextFundador.getText().toString().equals("elon musk") && numeroCoche == 9)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundador.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("2003") && numeroCoche == 9)
                {

                    //El edit text para decir que es correcto
                    editTextFundacion.setTextColor(Color.GREEN);


                }
                else if (!editTextFundacion.getText().toString().equals("2003") && numeroCoche == 9)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextFundacion.setTextColor(Color.RED);
                }


                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("roadster") && numeroCoche == 9)
                {

                    //El edit text para decir que es correcto
                    editTextModelo.setTextColor(Color.GREEN);


                }
                else if (!editTextModelo.getText().toString().equals("roadster") && numeroCoche == 9)
                {
                    //pongo el texto en rojo para decir que se a equivocado
                    editTextModelo.setTextColor(Color.RED);
                }


                break;





            //////////Aqui hacemos los casos del boton SIGUIENTE
            case R.id.buttonSiguiente:

                //BENTLEY
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("bentley") && numeroCoche == 0)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("walter bentley") && numeroCoche == 0)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1919") && numeroCoche == 0)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("continental gt3-r") && numeroCoche == 0)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //BUGATTI
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("bugatti") && numeroCoche == 1)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("ettore bugatti") && numeroCoche == 1)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1909") && numeroCoche == 1)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("chiron") && numeroCoche == 1)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //CADILLAC
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("cadillac") && numeroCoche == 2)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("henry ford") && numeroCoche == 2)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1902") && numeroCoche == 2)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("eldorado brougham") && numeroCoche == 2)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //CHEVROLET
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("chevrolet") && numeroCoche == 3)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("luis chevrolet") && numeroCoche == 3)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1911") && numeroCoche == 3)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("camaro") && numeroCoche == 3)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //DODGE
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("dodge") && numeroCoche == 4)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("john dodge") && numeroCoche == 4)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1914") && numeroCoche == 4)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("challenger") && numeroCoche == 4)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //LEXUS
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("lexus") && numeroCoche == 5)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("eiji toyoda") && numeroCoche == 5)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1989") && numeroCoche == 5)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("lfa") && numeroCoche == 5)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //MCLAREN
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("mclaren") && numeroCoche == 6)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("ron dennis") && numeroCoche == 6)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1989") && numeroCoche == 6)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("p1") && numeroCoche == 6)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //MORGAN
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("morgan") && numeroCoche == 7)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("h.f.s. morgan") && numeroCoche == 7)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1910") && numeroCoche == 7)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("aero 8") && numeroCoche == 7)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //SUBARU
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("subaru") && numeroCoche == 8)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("chikuhei nakajima") && numeroCoche == 8)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("1953") && numeroCoche == 8)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("brz") && numeroCoche == 8)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }



                //TESLA
                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextMarca.getText().toString().equals("tesla") && numeroCoche == 9)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundador.getText().toString().equals("elon musk") && numeroCoche == 9)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextFundacion.getText().toString().equals("2003") && numeroCoche == 9)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }

                //Comprueblo si lo que han escrito es correcto y coincide con el coche
                if (editTextModelo.getText().toString().equals("roadster") && numeroCoche == 9)
                {
                    //Contamos un acierto
                    contadorAciertos++;
                }





                //Sumamos un numero al contador de pregunta para mostrar otra pregunta
                contadorPreguntas++;


                //Cuando entramos en el evento ponemos todos los elemento en blanco y reabilito los editText
                editTextMarca.setTextColor(Color.BLACK);
                editTextFundador.setTextColor(Color.BLACK);
                editTextFundacion.setTextColor(Color.BLACK);
                editTextModelo.setTextColor(Color.BLACK);



                if (contadorPreguntas==10)
                {
                    mostrarResultado();
                }
                else
                {
                    //llamamos al metodo mostar pregunta
                    mostrarPregunta();
                }


                break;


            //////POR Defecto cuando ya haya hecho todas las preguntas se ira a mostrarResultado
            default:

                mostrarResultado();

                break;



            //////HAcemos el caso del boton SALIR
            case R.id.buttonSalir:

                mostrarResultado();

                break;



        }


    }

    public void mostrarResultado ()
    {
        //Hago visible los botones
        buttonComprobar.setVisibility(View.INVISIBLE);
        buttonSiguiente.setVisibility(View.INVISIBLE);
        buttonSalir.setVisibility(View.INVISIBLE);

        //Desactivo los editText para que no puedan escribir cuando se acaba el juego
//        editTextMarca.setFocusable(false);
//        editTextFundador.setFocusable(false);
//        editTextFundacion.setFocusable(false);
//        editTextModelo.setFocusable(false);


        // mostramos un Toast con la puntuacion del jugador
        Toast.makeText(MainActivity2.this, "Tu puntuacion ha sido de "+contadorAciertos+" de 40.", Toast.LENGTH_LONG).show();


        Bundle b = new Bundle();

        //Metemos en un cajon del bundle un dato, le pones de id "coche"
        //y metemos la variable que contiene que coche han elegido
        b.putInt("resultado", contadorAciertos);



    //Este metodo recibe el bundle de los otros metodos y activa
    // un Intent para ir a la otra activity

        //Creamos un objeto del tipo Intent, que sirve para ir de una activity a otra
        //diciendo primero donde estamos y despues de la coma, donde queremos ir
        Intent intencion = new Intent(MainActivity2.this, MainActivity.class);

        //Le añadimos al Intent que lleve con sigo el Bundle que lleva los datos que hemos guardado
        intencion.putExtras(b);

        //Activamos el Intent
        startActivity(intencion);
    }
}






