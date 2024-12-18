package com.example.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiplication extends AppCompatActivity {

    EditText e5,e6;
    Button b7;
    TextView t3;
    String getNum1,getNum2,result;
    int num1,num2,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        e5=(EditText) findViewById(R.id.et5);
        e6=(EditText) findViewById(R.id.et6);
        b7=(Button) findViewById(R.id.bt7);
        t3=(TextView) findViewById(R.id.resToDisp3);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e5.getText().toString();
                getNum2=e6.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                mul=num1*num2;
                result=String.valueOf(mul);
                t3.setText(result);
            }
        });

    }
}