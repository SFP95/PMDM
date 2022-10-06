package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("NIA","Mi  primer mensaje de Logat");
        setContentView(R.layout.activity_main);


    }
}