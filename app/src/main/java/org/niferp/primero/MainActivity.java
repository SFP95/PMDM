package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    android.content.res.Resources res = getResources();
    Resources resources =getResources();
    int veces = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  b=(Button) findViewById(R.id.idBoton);

        b.setOnClickListener(v ->accion());
    }

    private void accion(){

        res.getQuantityString(
                R.plurals.numPulsaciones,
                veces,
                veces
        );



        Button boton = (Button) (findViewById(R.id.idBoton));
        boton.setText("PULSADO %n VEZ");
    }
}