package srcNew.Ej5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.niferp.primero.R;

public class SecundaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(org.niferp.primero.R.layout.activity_secundary2);
        Persona persona = (Persona)(getIntent().getSerializableExtra("persona"));

        TextView tv = (TextView)findViewById(R.id.banner);
        tv.setText("HOLA "+persona);
    }
}