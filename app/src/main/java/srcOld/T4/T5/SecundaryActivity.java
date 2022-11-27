package srcOld.T4.T5;
/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.niferp.primero.R;

public class SecundaryActivity extends AppCompatActivity{

    private Button btnAlabar;

    @Override
   protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mostrarMensaje();
        contestar();
        Persona persona=(Persona)getIntent().getSerializableExtra("persona");
        String nombre= getIntent().getStringExtra("nombre");
        TextView tv = (TextView) findViewById(R.id.textoEscoge);
        tv.setText("Hola "+ nombre);
        tv.setText("Hola "+ persona.getNombre()+" - Edad: "+ persona.getEdad());



       int edad=getIntent().getIntExtra("Edad", -1);

       Toast.makeText(this,"Hola"+ nombre+ "! \n tu edad es de "+(edad+2),Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Hola "+ persona.getNombre() + "! \n tu edad es de "+(persona.getEdad()+2),Toast.LENGTH_LONG).show();



    }

    private void mostrarMensaje(View v) {
        String mensaje=getIntent().getStringExtra("mensaje");
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }


    private void contestar(View v) {
        String mensaje=getIntent().getStringExtra("Hola");
        Intent i;
        i.putExtra("mensaje",((TextView)(findViewById( R.id.textoEscoge))).getText().toString());

    }
    //5.2 La vista esta en el activity_main2

}*/