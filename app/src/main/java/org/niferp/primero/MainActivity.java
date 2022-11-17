package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void pulsar(View view){
        /**
         * Forma de arrancar la ventana seucndaria 5.0
        *startActivity(new Intent (this,SecundaryActivity.class));
        *Toast.makeText(this,"SORPRESA",Toast.LENGTH_SHORT).show();
        */

        //5.1
        Intent i = new Intent (this,SecundaryActivity.class);
        EditText et=findViewById(R.id.idNombre);
        String nombre=et.getText().toString().equals("")? et.getText().toString():"JOHN DOE";
        i.putExtra("nombre" ,nombre); //llevar texto extra al intent ala segunda ventana
        int dato=18;
        i.putExtra("edad",dato);
        startActivity(i);
/**
 * String nombre=getIntent().getStringExtra("nombre");
 *         //Toast.makeText(this,"Hola"+nombre,Toast.LENGTH_LONG);
 *         EditText tv = (EditText) findViewById( R.id.textoEscoge);
 *         tv.setText("Hola" + nombre);
 */
    }

}