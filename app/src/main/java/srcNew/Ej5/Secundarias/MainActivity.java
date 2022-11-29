package srcNew.Ej5.Secundarias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.niferp.primero.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void lanzarDosInterna(View v) {
        Intent i = new Intent(this,DosInterna.class);
        startActivity(i);
    }

    public void lanzarDosExterna(View v) {
        Intent i = new Intent(); // muesta la pantalla creado en un paquete fuera de el paquete de este main
        i.setClassName(
                "org.agaray.pmdm.t5.ejemplos.secundarias.dosexterna",
                "org.agaray.pmdm.t5.ejemplos.secundarias.dosexterna.MainActivity");
        startActivity(i);
    }
}