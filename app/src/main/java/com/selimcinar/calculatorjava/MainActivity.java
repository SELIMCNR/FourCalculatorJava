package com.selimcinar.calculatorjava;

<<<<<<< HEAD
=======
import androidx.appcompat.app.AppCompatActivity;
>>>>>>> 51dc5c6 (Initial commit)

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;


=======
public class MainActivity extends AppCompatActivity {
    //Global kapsamda tanımlamalar
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
>>>>>>> 51dc5c6 (Initial commit)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        number1Text = findViewById(R.id.sayi1Text);
        number2Text = findViewById(R.id.sayi2Text);
        resultText = findViewById(R.id.sonucText);

    }
    public  void topla(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")
        ){
            resultText.setText("Set Number ok ");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result : " + result);
        }
    }
    public void cikart(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")
        ){
            resultText.setText("Set Number ok ");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result : " + result);
        }
    }
    public  void carp(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")
        ){
            resultText.setText("Set Number ok ");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result : " + result);
        }
        }
    public void bol(View view){
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")
        ||number1Text.getText().toString().matches("0") || number2Text.getText().toString().matches("0")){
            resultText.setText("Set Number ok ");
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result : " + result);
        }
        }


}
=======

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
>>>>>>> 51dc5c6 (Initial commit)
