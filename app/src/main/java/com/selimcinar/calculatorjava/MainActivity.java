package com.selimcinar.calculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global kapsamda tanımlamalar
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeler tanımlandı ve idlere erişim sağlandı
         number1Text = findViewById(R.id.number1Text);
         number2Text = findViewById(R.id.number2Text);
         resultText = findViewById(R.id.ResultText);

    }


    //Buttonlarda onclicke atanmış değerlerle işlemler
    // herkese açık return yok adı sum (Görünüm tarafından çağrılacak)
    public  void  sum(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            Double number1 = Double.parseDouble(number1Text.getText().toString());
            Double number2 = Double.parseDouble(number1Text.getText().toString());
            Double result = number1 + number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText("Result " + result);
        }
    }
    public void deduct(View view){
//İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            Double number1 = Double.parseDouble(number1Text.getText().toString());
            Double number2 = Double.parseDouble(number1Text.getText().toString());
            Double result = number1 - number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText("Result " + result);
        }
    }
    public void multiply(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            Double number1 = Double.parseDouble(number1Text.getText().toString());
            Double number2 = Double.parseDouble(number1Text.getText().toString());
            Double result = number1 * number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText("Result " + result);
        }
    }
    public void divide(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            Double number1 = Double.parseDouble(number1Text.getText().toString());
            Double number2 = Double.parseDouble(number1Text.getText().toString());
            Double result = number1 / number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText("Result " + result);
        }
    }
}