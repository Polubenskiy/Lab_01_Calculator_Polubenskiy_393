package com.example.lab01_calculator_polubenskiy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText ta;
    EditText tb;
    EditText tForTrig;
    TextView lr;
    TextView lrTrig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.editTextNumberA);
        tb = findViewById(R.id.editTextNumberB);
        tForTrig = findViewById(R.id.editTextNumberC);
        lr = findViewById(R.id.textViewOutResult);
        lrTrig = findViewById(R.id.textViewResultForOutTrig);
    }

    public void action(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float a = 0;
        float b = 0;
        try
        {
            a = Float.parseFloat(sa);
            b = Float.parseFloat(sb);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Введите значение", Toast.LENGTH_SHORT).show();
        }
        float c = 0;
        switch (v.getId())
        {
            case R.id.buttonAdd:
                c = a + b;
                break;
            case R.id.buttonSubtraction:
                c = a - b;
                break;
            case R.id.buttonMultiplication:
                c = a * b;
                break;
            case R.id.buttonDivision:
                c = a / b;
                break;
        }
        String sc = String.valueOf(c);
        lr.setText(sc);
    }

    public void actionTrigonometry(View v)
    {
        String sforTrig = tForTrig.getText().toString();
        double forTrigon = 0;
        try
        {
            forTrigon = Double.parseDouble(sforTrig);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Введите значение", Toast.LENGTH_SHORT).show();
        }
        double c = 0;
        switch (v.getId())
        {
            case R.id.buttonSin:
                c = Math.sin(forTrigon);
                break;
            case R.id.buttonCos:
                c = Math.cos(forTrigon);
                break;
            case R.id.buttonTan:
                c = Math.tan(forTrigon);
                break;
            case R.id.buttonSqrt:
                c = Math.sqrt(forTrigon);
                break;
            case R.id.buttonPow:
                c = Math.pow(forTrigon, 2);
                break;
        }
        String sr = String.valueOf(c);
        lrTrig.setText(sr);
    }
}