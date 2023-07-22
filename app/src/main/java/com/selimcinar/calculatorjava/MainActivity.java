package com.selimcinar.calculatorjava;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.sayi1Text);
        number2Text = findViewById(R.id.sayi2Text);
        resultText = findViewById(R.id.sonucText);

    }
    public  void topla(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result = number1+number2;
        resultText.setText("Result : "+result);
    }
    public void cikart(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result = number1-number2;
        resultText.setText("Result : "+result);

    }
    public  void carp(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result = number1*number2;
        resultText.setText("Result : "+result);
    }
    public void bol(View view){
        int number1 = Integer.parseInt(number1Text.getText().toString());
        int number2 = Integer.parseInt(number2Text.getText().toString());
        int result = number1/number2;
        resultText.setText("Result : "+result);
    }


}
