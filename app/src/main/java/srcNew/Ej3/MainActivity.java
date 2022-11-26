package srcNew.Ej3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.niferp.primero.R;

public class MainActivity extends AppCompatActivity {
    Button b=(Button) findViewById(R.id.boton);
    TextView tv=(TextView) findViewById(R.id.mensaje);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accion(view);
            }
        });
    }
    private  void accion(View view){
        this.tv.setText("PULSADO");
    }
}