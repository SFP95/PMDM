package srcNew.Ej3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.niferp.primero.R;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private Button b2;
    private TextView tv;
    private int x;
    private String mensaje = "Pulsado " + this.x + " veces";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CV","OnCreate()"); //???

        ViewGroup vg = new LinearLayout(this);

        this.x=0;
        this.tv=new TextView(this);
        tv.setText("MENSAJE");
        this.b =new Button(this);
        b.setText("PULSA");
        this.b2=new Button(this);
        b2.setText("RESET");


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pulsar(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accionReset(view);
            }
        });
        vg.addView(b);
        vg.addView(tv);
        vg.addView(b2);

        //Paso Hilo de Vida
        onStarted();
        onResumed();
        onPaused();
        onStopped();
        onDesrtoy();
    }

    /*private  void accion(){
        b.setText("PULSADO");
        this.x++;
        tv.setText("Pulsado "+this.x+" veces");

        if(this.x==5){
            this.b.setEnabled(true); //cuando pulsas 5 veces el boton de deshabilita
        }

    }

    private void accionReset(View view) {
        boolean boton=this.b.isEnabled();
        if(boton==false){
            this.b.setEnabled(true);
            this.x=0;
            tv.setText("Pulsado " + this.x + " veces");
        }
    }*/

    public void pulsar(View view) {
        b.setText("PULSADO");
        this.x++;
        tv.setText("Pulsado "+this.x+" veces");

        if(this.x==5){
            this.b.setEnabled(true); //cuando pulsas 5 veces el boton de deshabilita
        }
    }

    public void accionReset(View view) {
        boolean boton=this.b.isEnabled();
        if(boton==false){
            this.b.setEnabled(true);
            this.x=0;
            tv.setText("Pulsado " + this.x + " veces");
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