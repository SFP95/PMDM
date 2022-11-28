package srcNew.Ej5.Secundarias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.niferp.primero.R;

public class DosInterna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary4);
    }

    public void cerrar(View v) {
        finish();
    }
}