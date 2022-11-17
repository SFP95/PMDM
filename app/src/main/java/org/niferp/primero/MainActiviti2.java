package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActiviti2 extends AppCompatActivity {
    private Button b;
    private Button b2;
    private TextView tv;
    private int x;
    private String mensaje = "Pulsado " + this.x + " veces";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




            Log.i("CV","OnCreate()");


            ViewGroup vg = new LinearLayout(this);


            this.tv =new TextView(this);
            tv.setText("MENSAJE");
            this.b =new Button(this);
            b.setText("PULSA");
            this.b2=new Button(this);
            b2.setText("RESET");
            this.x=0;

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
        b.setText("PULSADO");
        this.x++;
        tv.setText("Pulsado " + this.x + " veces");
        //añadir contador

           if (this.x==5){
               this.b.setEnabled(false);
               //deshabilita el boton al llegar a 5
           }

        }

    private void accionReset() {
        boolean boton=this.b.isEnabled();
        if(boton==false){
            this.b.setEnabled(true);
            this.x=0;
            tv.setText("Pulsado " + this.x + " veces");
        }
    }



/*      HILO DE VIDA DE LA APP
     protected void onStarted(){
        super.onStar();
        Log.i("CV", "onStar");
    }
    protected void onResumed(){
        super.onStar();
        Log.i("CV", "onPause");
    }
    protected void onPause(){
        super.onPause();
        Log.i("CV", "onPause");
     }
    protected void onRestart(){
        super.onCreate();
        Log.i("CV", "onCreate");
    }

    protected void onDesrtoy(){
        super.onCreate();
        Log.i("CV", "OnDestroy");
    }*/

    }

