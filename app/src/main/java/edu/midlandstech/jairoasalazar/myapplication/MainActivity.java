package edu.midlandstech.jairoasalazar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private SphereVolume sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        float radius =0;
        sv = new SphereVolume(radius);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        EditText eta = findViewById(R.id.etRadius);
        TextView answer = (findViewById(R.id.solution));
        String strR = eta.getText().toString();
        double radius=0;
        try{
            radius = Double.parseDouble(strR);
    }
        catch(NumberFormatException nfe){
        Log.w("mainActivity","Number format exception"+ nfe.getMessage());
        }
        sv.set(radius);
        answer.setText(""+sv.solution());
    }
}
