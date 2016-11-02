package com.example.morgan.appdecoches;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.morgan.appdecoches.R.id.textViewMarca;

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

        TextView textViewWeb = (TextView)findViewById(R.id.textViewWeb);

        ImageView imageViewCoche = (ImageView)findViewById(R.id.imageViewCoche);

        //Creamos un bundle y preguntamos si el Intent de la llamada lleva algo
        //en el intent
        Bundle b = getIntent().getExtras();

        //Hacemos un switch para que saber que boton al pulsado y dependiendo
        // de cual sea mostrar una imagen o otra
        switch (b.getString("coche"))
        {
            case "bugatti":
                editTextMarca.setText("Bugatti.");

                editTextFundador.setText("Ettore Bugatti.");
                editTextFundacion.setText("1909.");

                textViewWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("Sitio web: http://www.bugatti.com/home/"));
                        startActivity(i);
                    }
                });

                editTextModelo.setText("Veyron");
                imageViewCoche.setImageResource(R.drawable.bugattiveyron);

                break;
        }





    }
}
