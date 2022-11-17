package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecundaryActivity extends AppCompatActivity{


    @Override
   protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nombre= getIntent().getStringExtra("nombre");
        TextView tv = (TextView) findViewById(R.id.textoEscoge);
        tv.setText("Hola "+ nombre);

        int edad=getIntent().getIntExtra("Edad", -1);

        Toast.makeText(this,"Hola"+ nombre+ "! \n tu edad es de "+(edad+2),Toast.LENGTH_LONG).show();

    }
    //5.2 La vista esta en el activity_main2

}