package com.example.morgan.appdecoches;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Creo los objetos de los tipos que hay en la activity
        EditText editTextMarca = (EditText)findViewById(R.id.editTextMarca);
        EditText editTextFundador = (EditText)findViewById(R.id.editTextFundador);
        EditText editTextFundacion = (EditText)findViewById(R.id.editTextFundacion);
        EditText editTextModelo = (EditText)findViewById(R.id.editTextModelo);

        TextView textViewLink = (TextView)findViewById(R.id.textViewLink);

        ImageView imageViewCoche = (ImageView)findViewById(R.id.imageViewCoche);

        //Creamos un bundle y preguntamos si el Intent de la llamada lleva algo
        //en el intent
        Bundle b = getIntent().getExtras();

        //Hacemos un switch para que saber que boton al pulsado y dependiendo
        // de cual sea mostrar una imagen o otra
        switch (b.getString("coche"))
        {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                editTextFundacion.setText("1902.");
                editTextModelo.setText("Eldorado Brougham");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.cadillac_eldorado_brougham);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.cadillac.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                editTextFundacion.setText("1911.");
                editTextModelo.setText("Camaro");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.chevrolet_camaro);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.chevrolet.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                editTextFundacion.setText("1914.");
                editTextModelo.setText("Camaro");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.dodge_challenger);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://es.dodge.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                editTextFundacion.setText("1989.");
                editTextModelo.setText("LFA");

                //Añadimos la imagen que tiene que aparecer
                imageViewCoche.setImageResource(R.drawable.lexus_lfa);

                //El link que nos llevara a la pagina web del coche
                textViewLink.setText("http://www.lexus.com/");

                //Este metodo es para que cuando pulsen el link se habra
                // el navegador y vaya a la web
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
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
                textViewLink.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        //Creamos el objeto intent y le decimos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tesla.com/"));

                        //Iniciamos el Intent
                        startActivity(i);
                    }
                });

                break;




        }
    }
}
