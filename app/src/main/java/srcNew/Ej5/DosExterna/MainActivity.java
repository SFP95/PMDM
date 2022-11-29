package srcNew.Ej5.DosExterna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.niferp.primero.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        //paquete externa conectado al main de internas
    }
    public void cerrar(View v) {
        finish();
    }
}