package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.niferp.primero.domain.Persona;

public class SecundaryActivity extends AppCompatActivity{


    @Override
   protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Persona persona=(Persona)getIntent().getSerializableExtra("persona");
        //String nombre= getIntent().getStringExtra("nombre");
        TextView tv = (TextView) findViewById(R.id.textoEscoge);
        //tv.setText("Hola "+ nombre);
        tv.setText("Hola "+ persona);



        //int edad=getIntent().getIntExtra("Edad", -1);

        //Toast.makeText(this,"Hola"+ nombre+ "! \n tu edad es de "+(edad+2),Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Hola "+ persona + "! \n tu edad es de "+(persona.getEdad()+2),Toast.LENGTH_LONG).show();

    }
    //5.2 La vista esta en el activity_main2

}