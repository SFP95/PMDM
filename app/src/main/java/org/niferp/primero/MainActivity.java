package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

  //  private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurarListeners();

    }

    private void configurarListeners() {
        RadioGroup rg =  findViewById(R.id.rg);
        //con un lambda
        rg.setOnCheckedChangeListener((radioGroup,id) -> accionCambioRG(id));
        /**
         * new RadioGroup.OnCheckedChangeListener() {
         *                     @Override
         *                     public void onCheckedChanged(RadioGroup radioGroup, int idRB) {
         *                         accionCambioRG(idRB);
         *                     }
         *                 }
         */
    }
    private  void accionCambioRG( int id){
        String mensaje="";
        switch (id){
            case R.id.rb1:mensaje="eres un tuno" ;break;
            case R.id.rb2: mensaje= "vaya tos";break;
            case R.id.rb3: mensaje ="del derechos o del reves" ;break;
        }
        TextView tv=findViewById(R.id.solido);
        tv.setText(mensaje);
    }
}