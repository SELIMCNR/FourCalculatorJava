package com.selimcinar.calculatorjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.selimcinar.calculatorjava.databinding.ActivityMainBinding;




public class MainActivity extends AppCompatActivity {
    //Global kapsamda tanımlamalar
    private ActivityMainBinding binding;
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //İnflate xml ile kodları bağlar bu aşağıdaki kodları her aktivitede ekle
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Objeler tanımlandı ve idlere erişim sağlandı
         number1Text = binding.number1Text.findViewById(R.id.number1Text);
         number2Text = binding.number2Text.findViewById(R.id.number2Text);
         resultText = binding.ResultText.findViewById(R.id.ResultText);

    }


    //Buttonlarda onclicke atanmış değerlerle işlemler
    // herkese açık return yok adı sum (Görünüm tarafından çağrılacak)
    @SuppressLint("SetTextI18n")
    public  void  sum(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number1Text.getText().toString());
            double result = number1 + number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText(Double.toString(result));
        }
    }
    @SuppressLint("SetTextI18n")
    public void deduct(View view){
//İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number1Text.getText().toString());
            double result = number1 - number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText(Double.toString(result));
        }
    }
    @SuppressLint("SetTextI18n")
    public void multiply(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number1Text.getText().toString());
            double result = number1 * number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText(Double.toString(result));
        }
    }
    @SuppressLint("SetTextI18n")
    public void divide(View view){
        //İf kontrolünde boş rakam girişi engellendi
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number" );
        }
        else {
            //Kullanıcıdan veri almak objelerde
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number1Text.getText().toString());
            double result = number1 / number2;
            //Double değeri otomatik stringe dönüştürdü
            resultText.setText(Double.toString(result));
        }
    }
}