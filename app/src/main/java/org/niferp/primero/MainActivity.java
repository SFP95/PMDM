package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  b=(Button) findViewById(R.id.idBoton);


        b.setOnClickListener(v ->accion());
    }

    private void accion(){
        Button boton = (Button) (findViewById(R.id.idBoton));
        boton.setText("PULSADO $N VEZ");
    }
}