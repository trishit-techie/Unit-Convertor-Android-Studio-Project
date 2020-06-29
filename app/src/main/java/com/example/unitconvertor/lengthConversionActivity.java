package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class lengthConversionActivity extends AppCompatActivity {

    EditText kilometerEditText;
    EditText meterEditText;
    EditText centimeterEditText;
    EditText footEditText;
    EditText inchesEditText;
    EditText micronEditText;
    EditText milesEditText;

    public void reset(View view){
        
        kilometerEditText.setText("");
        micronEditText.setText("");
        centimeterEditText.setText("");
        milesEditText.setText("");
        footEditText.setText("");
        meterEditText.setText("");
        inchesEditText.setText("");
    }
    public void convert(View view){

        if(!kilometerEditText.getText().toString().equals("")){

            float kilometers = Float.parseFloat(kilometerEditText.getText().toString());
            meterEditText.setText(String.valueOf(kilometers*1000)+" m");
            centimeterEditText.setText(String.valueOf(kilometers*100000)+" cm");
            milesEditText.setText(String.valueOf(kilometers*0.621)+" miles");
            footEditText.setText(String.valueOf(kilometers*3280.84)+ " ft");
            inchesEditText.setText(String.valueOf(kilometers*39370.1)+" inches");
            micronEditText.setText(String.valueOf(kilometers*1000000000)+" meu");
        }
        else if(!meterEditText.getText().toString().equals("")){

            float meters = Float.parseFloat(meterEditText.getText().toString());
            kilometerEditText.setText(String.valueOf(meters/1000)+" km");
            centimeterEditText.setText(String.valueOf(meters*1000)+" cm");
            milesEditText.setText(String.valueOf(meters*0.000621371)+" miles");
            footEditText.setText(String.valueOf(meters*3.28084)+ " ft");
            inchesEditText.setText(String.valueOf(meters*39.3701)+" inches");
            micronEditText.setText(String.valueOf(meters*1000000)+" meu");
        }
        else if (!centimeterEditText.getText().toString().equals("")){

            float centimeters = Float.parseFloat(centimeterEditText.getText().toString());
            meterEditText.setText(String.valueOf(centimeters/100)+" m");
            kilometerEditText.setText(String.valueOf(centimeters/100000)+" km");
            milesEditText.setText(String.valueOf(centimeters*(6.214/1000000))+" miles");
            footEditText.setText(String.valueOf(centimeters*0.0328)+ " ft");
            inchesEditText.setText(String.valueOf(centimeters*0.393701)+" inches");
            micronEditText.setText(String.valueOf(centimeters*10000)+" meu");
        }
        else if(!milesEditText.getText().toString().equals("")){

            float miles = Float.parseFloat(milesEditText.getText().toString());
            meterEditText.setText(String.valueOf(miles*1609.34)+" m");
            centimeterEditText.setText(String.valueOf(miles*160934)+" cm");
            kilometerEditText.setText(String.valueOf(miles*1.60934)+" km");
            footEditText.setText(String.valueOf(miles*5280)+ " ft");
            inchesEditText.setText(String.valueOf(miles*63360)+" inches");
            micronEditText.setText(String.valueOf(miles*1609344000)+" meu");
        }
        else if(!footEditText.getText().toString().equals("")){

            float foot = Float.parseFloat(footEditText.getText().toString());
            meterEditText.setText(String.valueOf(foot*0.3048)+" m");
            centimeterEditText.setText(String.valueOf(foot*30.48)+" cm");
            milesEditText.setText(String.valueOf(foot*0.000189394)+" miles");
            kilometerEditText.setText(String.valueOf(foot*0.0003048)+ " km");
            inchesEditText.setText(String.valueOf(foot*12)+" inches");
            micronEditText.setText(String.valueOf(foot*304800)+" meu");
        }
        else if(!inchesEditText.getText().toString().equals("")){

            float inches = Float.parseFloat(inchesEditText.getText().toString());
            meterEditText.setText(String.valueOf(inches*0.0254)+" m");
            centimeterEditText.setText(String.valueOf(inches*2.54)+" cm");
            milesEditText.setText(String.valueOf(inches/63360)+" miles");
            footEditText.setText(String.valueOf(inches/12)+ " ft");
            kilometerEditText.setText(String.valueOf(inches/39370)+" km");
            micronEditText.setText(String.valueOf(inches*25400)+" meu");
        }
        else if(!micronEditText.getText().toString().equals("")){

            float micrometer = Float.parseFloat(micronEditText.getText().toString());
            meterEditText.setText(String.valueOf(micrometer/1000000)+" m");
            centimeterEditText.setText(String.valueOf(micrometer/10000)+" cm");
            milesEditText.setText(String.valueOf(micrometer*(6.214/(1000000000*10)))+" miles");
            footEditText.setText(String.valueOf(micrometer/304800)+ " ft");
            inchesEditText.setText(String.valueOf(micrometer/25400)+" inches");
            kilometerEditText.setText(String.valueOf(micrometer/1000000000)+" meu");
        }
        else{
            Toast.makeText(lengthConversionActivity.this,"Invalid input type",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_conversion);
        getSupportActionBar().hide();
        kilometerEditText = (EditText)findViewById(R.id.kilometerEditText);
        meterEditText = (EditText)findViewById(R.id.meterEditText);
        centimeterEditText = (EditText)findViewById(R.id.centimeterEditText);
        footEditText = (EditText)findViewById(R.id.footEditText);
        inchesEditText = (EditText)findViewById(R.id.inchesEditText);
        milesEditText = (EditText)findViewById(R.id.milesEditText);
        micronEditText = (EditText)findViewById(R.id.micronEditText);
    }
}