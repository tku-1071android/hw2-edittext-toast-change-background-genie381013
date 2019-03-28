package com.example.hw02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    int size = 30;
    public void response (View v){
        EditText ed1, ed2, ed3;
        TextView txv;
        Button btn;

        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        txv = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);


        double height = Double.parseDouble(ed2.getText().toString());
        double weight = Double.parseDouble(ed3.getText().toString());

        txv.setTextSize(size);
        txv.setText(ed1.getText().toString() + ",您好\n" + "您的BMI是:") ;
    }
    private double calculateBMI(double height, double weight){
        double BMI = 0;
        BMI = weight / Math.pow((height/100),2);
        return BMI;
    }
}