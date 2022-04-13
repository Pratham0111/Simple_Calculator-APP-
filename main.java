package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    TextView tv_result;
    Button btn_add, btn_sub, btn_mul, btn_div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv_result=findViewById(R.id.tvresult);
        btn_add=findViewById(R.id.btn_add);
        btn_sub=findViewById(R.id.btn_sub);
        btn_mul=findViewById(R.id.btn_mul);
        btn_div=findViewById(R.id.btn_div);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1= Double.parseDouble(et1.getText().toString());
                Double num2= Double.parseDouble(et2.getText().toString());
                Double result = num1 +num2;
                tv_result.setText(String.valueOf("The Addition is : "+result));
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1= Double.parseDouble(et1.getText().toString());
                Double num2= Double.parseDouble(et2.getText().toString());
                Double result = num1 - num2;
                tv_result.setText(String.valueOf("The Subtraction is : "+result));

            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1= Double.parseDouble(et1.getText().toString());
                Double num2= Double.parseDouble(et2.getText().toString());
                Double result = num1 * num2;
                tv_result.setText(String.valueOf("The Multiplication is : "+result));
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1= Double.parseDouble(et1.getText().toString());
                Double num2= Double.parseDouble(et2.getText().toString());
                Double result = num1 / num2;
                tv_result.setText(String.valueOf("The Division is : "+result));
            }
        });
    }
}
