package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);

            super.onCreate(savedInstanceState);

            ViewGroup vg = new LinearLayout(this);

            Button b =new Button(this);
            b.setText("PULSA");
            TextView tv =new TextView(this);
            tv.setText("TEXTO");

            vg.addView(b);
            vg.addView(tv);

            setContentView(vg);
        //Log.d("NIA", "Mi  primer mensaje de Logat");
        //setContentView(R.layout.activity_main);


    }
}
