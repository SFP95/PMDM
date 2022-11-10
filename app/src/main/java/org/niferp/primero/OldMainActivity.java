package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;


public class OldMainActivity extends AppCompatActivity {

/* 4.0
//  private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  b=(Button) findViewById(R.id.idBoton);*/

    //String antiguaEtiqueta=b.getText().toString();
    //b.setText(antiguaEtiqueta  += "FUERTE");

       /* b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                    accion(view);
                                 }
                             }
        );*/
    //b.setOnClickListener(v ->accion(v)); //es lo mismo que lo de arriba pero usando el metodo lambda
      /*  b.setOnClickListener(v ->accion());
    }
    //private void accion(View view)
    private void accion(){
        //Button boton = (Button) view;
        Button boton = (Button) (findViewById(R.id.idBoton));
        boton.setText("PULSADO");
    }*/
}
/** 4.1
 *
 *  RadioGroup g=new RadioGroup(this);
 *          g.setOnCheckedChangeListener(
 *                  new RadioGroup.OnCheckedChangeListener(){
 *                      @Override
 *                      public void onCheckedChanged(RadioGroup radioGroup, int i) {
 *
 *                      }
 *                  }
 *          );
 *
 *  this.n=0;
 *         Button  b=(Button) findViewById(R.id.idBoton);
 *         b.setOnClickListener(v ->accion(v));
 *
 *     }
 *
 *     private void accion(View v){
 *         Button boton = (Button) v;
 *         this.n++;
 *         if (this.n==1){
 *             boton.setText("PULSADO "+this.n+" VEZ");
 *         }else {
 *             boton.setText("PULSADO "+this.n+" VECES");
 *         }
 *     }
 */

/** 4.2
 *  private void configurarListeners() {
 *         RadioGroup rg =  findViewById(R.id.rg);
 *         //con un lambda
 *         rg.setOnCheckedChangeListener((radioGroup,id) -> accionCambioRG(id));
 *         /**
 *          * new RadioGroup.OnCheckedChangeListener() {
 *          *                     @Override
 *          *                     public void onCheckedChanged(RadioGroup radioGroup, int idRB) {
 *          *                         accionCambioRG(idRB);
 *          *                     }
 *          *                 }
 *          */

/** 4.3
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

 */