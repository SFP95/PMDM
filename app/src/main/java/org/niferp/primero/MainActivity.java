package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private Button b2;
    private TextView tv;
    private int x;
    private String mensaje="Pulsado " + this.x + " veces";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            ViewGroup vg = new LinearLayout(this);

            this.x=0;
            this.tv =new TextView(this);
            tv.setText("MENSAJE");
            this.b =new Button(this);
            b.setText("PULSA");
            this.b2=new Button(this);
            b2.setText("RESET");

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    accionPulsado();

                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    accionReset();
                }
            });
            vg.addView(b);
            vg.addView(tv);
            vg.addView(b2);

            setContentView(vg);

            //ACCIONES DE MENSAJES EN EL LOGCAT
        //Log.d("NIA", "Mi  primer mensaje de Logat");
        //setContentView(R.layout.activity_main);


    }


    private void accionPulsado() {
     //   tv.setText("PULSADO");

        //añadir contador

           this.x++;

           if (this.x==6){
               this.b.setEnabled(false);
               //deshabilita el boton al llegar a 5
           }
        tv.setText(this.mensaje);
        }

    private void accionReset() {
        boolean boton=this.b.isEnabled();
        if(boton==false){
            this.b.setEnabled(true);
            this.x=0;
            tv.setText(this.mensaje);
        }
    }

    }

