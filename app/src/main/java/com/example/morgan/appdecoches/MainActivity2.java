package com.example.morgan.appdecoches;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //Declaro las variables con las que identificare cada elemento
    EditText editTextMarca;
    EditText editTextFundador;
    EditText editTextFundacion;
    EditText editTextModelo;
    TextView textViewLink;
    ImageView imageViewCoche;
    Button buttonComprobar;

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
                editTextFundacion.setText("1902.");
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
                editTextFundacion.setText("1911.");
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
                editTextFundacion.setText("1914.");
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
                editTextFundacion.setText("1989.");
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

                juego();

        }

    }



    //Esta funcion es la del juego
    public void juego()
    {
        //Empezaremos creando una array de 10 posiciones que guarde en una
        // array 10 numero sin repetirse que seran los 10 posibles coches que saldran
        int i = 0, j = 0, cantidad = 10, rango = 10;

        //En esta array guardaremos 10 numero del 0 al 9 y no se repetira ninguno
        int array[] = new int[cantidad];

        array[i] = (int) (Math.random() * rango);

        for (i = 1; i < cantidad; i++) {
            array[i] = (int) (Math.random() * rango);

            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }
        }


        //Ahora recorremos el array que por cada vuelta mostrara un coche distinto
        for (int cp = 0; cp < cantidad; cp++) {
            switch (array[cp])
            {
                case 0:

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
                case 1:

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
                case 2:

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

                    //Rellenamos los editText que corresponde con este caso
                    editTextMarca.setText("Dodge");
                    editTextFundador.setText("John Dodge");
                    editTextFundacion.setText("1914.");
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
                case 5:

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
                case 7:

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
                case 8:

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
                case 9:

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
            }
        }
    }
}






