package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void convertLength(View view){

        Intent intent = new Intent(this,lengthConversionActivity.class);
        startActivity(intent);

    }
    public void convertTemperature(View view){

        Intent intent = new Intent(this,temperatureConversionActivity.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}