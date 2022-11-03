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
        rg.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int idRB) {
                        accionCambioRG(idRB);
                    }
                }
        );
    }
    private  void accionCambioRG( int id){
        String mensaje="";
        switch (id){
            case R.id.rb1:mensaje="eres un tuno" ;break;
            case R.id.rv2: mensaje= "vaya tos";break;
            case R.id.rb3: mensaje ="del derechos o del reves" ;break;
            case R.id.rb4: mensaje=" la cara de tu retrato";break;

        }
        TextView tv=findViewById(R.id.salida);
        tv.setText(mensaje);
    }
}