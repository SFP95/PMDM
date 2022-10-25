package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n=0;
        Button  b=(Button) findViewById(R.id.idBoton);
        b.setOnClickListener(v ->accion(v));

    }

    private void accion(View v){
        Button boton = (Button) v;
        this.n++;
        if (this.n==1){
            boton.setText("PULSADO "+this.n+" VEZ");
        }else {
            boton.setText("PULSADO "+this.n+" VECES");
        }
    }
}