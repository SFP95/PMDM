package srcOld.T4;

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

/** ACT 4
 * package org.niferp.primero;
 *
 * import androidx.appcompat.app.AppCompatActivity;
 *
 * import android.content.Context;
 * import android.content.res.Resources;
 * import android.os.Bundle;
 * import android.view.View;
 * import android.widget.Button;
 * import android.widget.CheckBox;
 * import android.widget.RadioButton;
 * import android.widget.RadioGroup;
 * import android.widget.TextView;
 * import android.widget.Toast;
 *
 *
 * public class MainActivity extends AppCompatActivity {
 *
 *     private RadioGroup menu;
 *     private RadioButton rbLight;
 *     private RadioButton rbNormal;
 *     private RadioButton rbGraso;
 *     private CheckBox ckBrocoli;
 *     private CheckBox ckJamonYork;
 *     private CheckBox ckHamburguesa;
 *     private CheckBox ckTorreznos;
 *     private TextView banner;
 *
 *     @Override
 *     protected void onCreate(Bundle savedInstanceState) {
 *
 *         super.onCreate(savedInstanceState);
 *         setContentView(R.layout.activity_main);
 *         asociarControles();
 *         configurarListeners();
 *
 *     }
 *
 *     private void asociarControles() {
 *         this.menu=findViewById(R.id.radioGroup);
 *         this.rbLight=findViewById(R.id.rbLight);
 *         this.rbNormal=findViewById(R.id.rbNormal);
 *         this.rbGraso=findViewById(R.id.rbGraso);
 *         this.ckBrocoli=findViewById(R.id.ckBrocoli);
 *         this.ckJamonYork=findViewById(R.id.ckJamonYork);
 *         this.ckHamburguesa=findViewById(R.id.ckHamburguesa);
 *         this.ckTorreznos=findViewById(R.id.ckTorreznos);
 *         this.banner=findViewById(R.id.banner);
 *     }
 *     private void configurarListeners() {
 *         this.menu.setOnCheckedChangeListener((cb,b)->actualizar());
 *         this.ckBrocoli.setOnCheckedChangeListener((cb,b)->actualizar());
 *         this.ckJamonYork.setOnCheckedChangeListener((cb,b)->actualizar());
 *         this.ckHamburguesa.setOnCheckedChangeListener((cb,b)->actualizar());
 *         this.ckTorreznos.setOnCheckedChangeListener((cb,b)->actualizar());
 *     }
 *     private  void actualizar(){
 *         int calorias=0;
 *         calorias += ckBrocoli.isChecked()? 100:0;
 *         calorias += ckJamonYork.isChecked()? 500:0;
 *         calorias += ckHamburguesa.isChecked()? 1500:0;
 *         calorias += ckTorreznos.isChecked()? 2000:0;
 *
 *         int min=0;
 *         int max=0;
 *
 *        switch (menu.getCheckedRadioButtonId()){
 *            case R.id.rbLight:min=0;max=1000;break;
 *            case R.id.rbNormal:min=1000;max=2000 ; break;
 *            case R.id.rbGraso:min=2000;max=100000; break;
 *
 *        }
 *         String mensaje=(calorias >= min && calorias < max)? "OK" : "FATAL";
 *         mensaje += " - Te estás enchufando %1$d calorías";
 *         mensaje= String.format(mensaje, calorias);
 *
 *         this.banner.setText(mensaje);
 *     }
 *     private void tostada(String mensaje){ //ventanita emergente que dura unos segundos
 *         Context context= getApplicationContext();
 *         int duracion= Toast.LENGTH_SHORT;
 *         Toast toast= Toast.makeText(context,mensaje,duracion);
 *         toast.show();
 *     }
 *     //version lambda
 * }
 */