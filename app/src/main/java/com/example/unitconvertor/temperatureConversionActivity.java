package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class temperatureConversionActivity extends AppCompatActivity {

    EditText celciusEditText;
    EditText fahrenheitEditText;
    EditText kelvinEditText;

    public  void reset(View view){

        celciusEditText.setText("");
        fahrenheitEditText.setText("");
        kelvinEditText.setText("");

    }
    public void convert(View view){

        if(!celciusEditText.getText().toString().equals("")){

            float celcius = Float.parseFloat(celciusEditText.getText().toString());
            fahrenheitEditText.setText(String.valueOf((9/5)*celcius+32)+" F");
            kelvinEditText.setText(String.valueOf(celcius+273)+" K");

        }
        else if(!fahrenheitEditText.getText().toString().equals("")){

            float fahrenheit = Float.parseFloat(fahrenheitEditText.getText().toString());
            celciusEditText.setText(String.valueOf((5/9)*(fahrenheit-32))+" C");
            kelvinEditText.setText(String.valueOf(Float.parseFloat(celciusEditText.getText().toString())+273)+" K");

        }
        else if(!kelvinEditText.getText().toString().equals("")){

            float kelvin = Float.parseFloat(kelvinEditText.getText().toString());
            celciusEditText.setText(String.valueOf(Float.parseFloat(kelvinEditText.getText().toString())-273));
            fahrenheitEditText.setText(String.valueOf((9/5)*(Float.parseFloat(celciusEditText.getText().toString()))+32));

        }
        else{

            Toast.makeText(this, "Invalid input type", Toast.LENGTH_LONG).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_conversion);
        getSupportActionBar().hide();
        celciusEditText = (EditText)findViewById(R.id.celciusEditText);
        fahrenheitEditText = (EditText)findViewById(R.id.fahrenheitEditText);
        kelvinEditText = (EditText)findViewById(R.id.kelvinEditText);

    }
}