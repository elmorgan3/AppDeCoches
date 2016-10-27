package com.example.morgan.appdecoches;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Declaro todas las variables de tipo ImageBotton con los respectivos nombres
    ImageButton btnMustang, btnTesla,btnDodge,btnLexus,btnMorgan,btnCadillac,btnSmart,btnChevrolet,btnDodgeViper,btnBuagatti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hago el casting para relacionar todos los objetos con su view en la activity
        btnBuagatti = (ImageButton) findViewById(R.id.imageButtonBuagatti);
        btnCadillac = (ImageButton) findViewById(R.id.imageButtonCadillac);
        btnChevrolet = (ImageButton) findViewById(R.id.imageButtonChevrolet);
        btnDodge = (ImageButton) findViewById(R.id.imageButtonDodge);
        btnDodgeViper = (ImageButton) findViewById(R.id.imageButtonDodgeViper);
        btnLexus = (ImageButton) findViewById(R.id.imageButtonLexus);
        btnMorgan = (ImageButton) findViewById(R.id.imageButtonMorgan);
        btnMustang = (ImageButton) findViewById(R.id.imageButtonMustang);
        btnSmart = (ImageButton) findViewById(R.id.imageButtonSmart);
        btnTesla = (ImageButton) findViewById(R.id.imageButtonTesla);


    }

}
