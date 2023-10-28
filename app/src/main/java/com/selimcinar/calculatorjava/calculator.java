package com.selimcinar.calculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    int number1;
    int number2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

         number1Text = findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultText = findViewById(R.id.ResultText);

    }

    public void topla(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter number");
        }
        else {
            number1=Integer.parseInt( number1Text.getText().toString());
            number2=Integer.parseInt(number2Text.getText().toString());
            result = number1+number2;
            resultText.setText("Result : "+result);
        }

    }

    public  void cikar(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter number");
    }
        else {
            number1=Integer.parseInt(number1Text.getText().toString());
            number2=Integer.parseInt(number2Text.getText().toString());
            result = number1-number2;
            resultText.setText("Result : "+result);
        }

    }

    public  void  carp(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number");
        } else {
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());
            result = number1 * number2;
            resultText.setText("Result : " + result);
        }
    }


    public void  bol(View view){
        if (number1Text.getText().toString().matches("")||number2Text.getText().toString().matches(""))
        {
            resultText.setText("Enter number");
        }
        else{
            number1 = Integer.parseInt(number1Text.getText().toString());
            number2 = Integer.parseInt(number2Text.getText().toString());
            result = number1 / number2;
            resultText.setText("Result : "+result);
        }

    }



}