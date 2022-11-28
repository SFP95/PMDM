package srcNew.Ej5.Implicitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import org.niferp.primero.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void caso1(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_POWER_USAGE_SUMMARY);
        startActivity(i);
    }

    public void caso2a(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.amazon.com"));
        startActivity(i);
    }

    public void caso2b(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("sms:555443"));
        startActivity(i);
    }

    public void caso3(View v) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);

        i.setType("vnd.android-dir/mms-sms");
        i.putExtra("address", "5554433");
        /*
        i.setData(Uri.parse("sms:"));
        */
        startActivity(i);
    }
}