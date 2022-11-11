package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void pulsar(View view){
        //Forma de arrancar la ventana seucndaria 5.0
        startActivity(new Intent (this,SecundaryActivity.class));
        Toast.makeText(this,"SORPRESA",Toast.LENGTH_SHORT).show();

        //5.1

    }

}