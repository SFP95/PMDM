package com.example.mispruebaspmdm;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button b;  //reset
    private Button b2; //pulsar
    private TextView tv; //mensaje
    private int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("CV","OnCreate()"); //Inicio ciclo e vida
       // ViewGroup vg = new LinearLayout(this);

        x=0;

        tv=(TextView) findViewById(R.id.mensaje);
        b = (Button) findViewById(R.id.boton);
        b2=(Button) findViewById(R.id.reset);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {pulsar(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { accionReset(view);
            }
        });

        //Paso Hilo de Vida
       /* onStarted();
        onResumed();
        onPaused();
        onStopped();
        onDesrtoy();*/
    }


    public void pulsar(View view) {
        b.setText("PULSADO");
        x++;
        tv.setText("Pulsado "+x+" veces");

        if(x==5){
           b.setEnabled(false); //cuando pulsas 5 veces el boton de deshabilita
        }
    }

    public void accionReset(View view) {
        boolean boton=b.isEnabled();
        if(boton==false ){
            b.setEnabled(true);
            x=0;
            tv.setText("Pulsado " + x + " veces");
        }
    }

    //HILO DE VIDA

    protected  void OnCreate(){
        super.onStart();
        Log.i("CV", "onStar");
    }
    protected void onStarted(){
        super.onResume();
        Log.i("CV", "onStarted");
    }
    protected void onResumed(){
        super.onPause();
        Log.i("CV", "onResume");
    }
    protected void onPaused(){
        super.onStop();
        Log.i("CV", "onPaused");
    }
    protected void onStopped(){
        super.onDestroy();
        Log.i("CV", "onStopped");
    }
    protected void onDesrtoy() {
        //super.onCreate();
        Log.i("CV", "OnDestroy");
    }
}