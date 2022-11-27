package srcNew.Ej4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.niferp.primero.R;

import srcNew.Ej4.domain.Persona;

public class MainActivity extends AppCompatActivity {
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b=(Button) findViewById(R.id.btnIrSegunWin);
        b.setOnClickListener(v -> abrirVentana());
    }

    public void abrirVentana() {
        Intent i = new Intent(this, SecundaryActivity.class);
        EditText et = (EditText) findViewById(R.id.EditText);

        String nombre = !et.getText().toString().equals("") ? et.getText().toString() : "JOHN DOE";
        int edad = (int)((Math.random()*50)+1);

        Persona persona = new Persona(nombre,edad);
        i.putExtra("persona",persona);
        startActivity(i);
    }
}