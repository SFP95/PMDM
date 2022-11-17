package org.niferp.primero;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.niferp.primero.domain.Persona;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void pulsar(View view){

//COMENTAR DE GOLPE ALGO: select + contrl + /

/**
* Forma de arrancar la ventana seucndaria 5.0
* startActivity(new Intent (this,SecundaryActivity.class));
* Toast.makeText(this,"SORPRESA",Toast.LENGTH_SHORT).show();
*/

        //5.1
        Intent i = new Intent (this,SecundaryActivity.class);
        EditText et=findViewById(R.id.idNombre);
        String nombre=!et.getText().toString().equals("")? et.getText().toString():"Nia";
       // i.putExtra("nombre" ,nombre); //llevar texto extra al intent ala segunda ventana

        int edad=(int)((Math.random()*50)+1);
        System.out.println(edad);
        Persona persona=new Persona(nombre,edad);
       // i.putExtra("persona",persona);

        //startActivity(i); Si queremos abrir la 2ª ventana sin esperar resultados

/**
 * String nombre=getIntent().getStringExtra("nombre");
 *         //Toast.makeText(this,"Hola"+nombre,Toast.LENGTH_LONG);
 *         EditText tv = (EditText) findViewById( R.id.textoEscoge);
 *         tv.setText("Hola" + nombre);
 */

        // RECIBIR DATOS DE LA PANTALA SECUNDARIA

        i.putExtra("mensaje",((TextView)(findViewById( R.id.textoEscoge))).getText().toString());

        startActivityForResult(i,1); //para abir la ventaba ESPARANDO LAS RESPUESTADESDE LAS SECUNDARIA
        protected void onActivityResult(int requestCode , int resultCode, @Nullable Intent dara){
            super.onActivityResult(requestCode,resultCode,data);
        }
    }

}