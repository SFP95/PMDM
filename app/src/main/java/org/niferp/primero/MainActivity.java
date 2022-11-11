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
        //Forma de arrancar la ventana seucndaria 5.0
        //startActivity(new Intent (this,SecundaryActivity.class));
        //Toast.makeText(this,"SORPRESA",Toast.LENGTH_SHORT).show();

        //5.1
        EditText et=findViewById(R.id.idNombre);
        String nombre=et.getText().toString();
        Intent i = new Intent (this,SecundaryActivity.class);
        i.putExtra("nombre" ,nombre);
        startActivity(i);

    }

}