package com.example.morgan.appdecoches;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Creo los objetos de los tipos que hay en la activity
        TextView textViewMarca = (TextView)findViewById(R.id.textViewMarca);
        TextView textViewFundador = (TextView)findViewById(R.id.textViewFundador);
        TextView textViewFundacion = (TextView)findViewById(R.id.textViewFundacion);
        TextView textViewWeb = (TextView)findViewById(R.id.textViewWeb);
        TextView textViewModelo = (TextView)findViewById(R.id.textViewModelo);
        ImageView imageViewCoche = (ImageView)findViewById(R.id.imageViewCoche);

        //Creamos un bundle y preguntamos si el Intent de la llamada lleva algo
        //en el intent
        Bundle b = getIntent().getExtras();

        //Hacemos un switch para que saber que boton al pulsado y dependiendo
        // de cual sea mostrar una imagen o otra
        switch (b.getString("coche"))
        {
            case "bugatti":
                textViewMarca.setText("Marca: Bugatti.");
                textViewFundador.setText("Fundador: Ettore Bugatti.");
                textViewFundacion.setText("Fundación: 1909.");

                textViewWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("Sitio web: http://www.bugatti.com/home/"));
                        startActivity(i);
                    }
                });

                textViewModelo.setText("Modelo: Veyron");
                imageViewCoche.setImageResource(R.drawable.Bugatti_Veyron);

                break;
        }





    }
}
