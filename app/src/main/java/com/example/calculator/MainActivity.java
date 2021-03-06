package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private TextView result;

    private String first, second;
    private  int f,s;
    private int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addbtn, subbtn, mulbtn, divbtn, modbtn;
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView4);
        addbtn = findViewById(R.id.addBtn);
        subbtn = findViewById(R.id.subBtn);
        mulbtn = findViewById(R.id.mulBtn);
        divbtn = findViewById(R.id.divBtn);
        modbtn = findViewById(R.id.modBtn);

        addbtn.setOnClickListener(v -> add());
        subbtn.setOnClickListener(v -> sub());

        mulbtn.setOnClickListener(v -> mul());

        divbtn.setOnClickListener(v -> div());

        modbtn.setOnClickListener(v -> mod());
    }

    private void add(){
        first = editText1.getText().toString();
        second = editText2.getText().toString();
        f = Integer.parseInt(first);
        s = Integer.parseInt(second);
        total = f+s;
        result.setText(String.valueOf(total));
    }

    private void sub(){
        first = editText1.getText().toString();
        second = editText2.getText().toString();
        f = Integer.parseInt(first);
        s = Integer.parseInt(second);
        total = f-s;
        result.setText(String.valueOf(total));
    }

    private void mul(){
        first = editText1.getText().toString();
        second = editText2.getText().toString();
        f = Integer.parseInt(first);
        s = Integer.parseInt(second);
        total = f*s;
        result.setText(String.valueOf(total));
    }

    private void div(){
        first = editText1.getText().toString();
        second = editText2.getText().toString();
        f = Integer.parseInt(first);
        s = Integer.parseInt(second);
        double divide = ((double)f/s);
        result.setText(String.valueOf(divide));
    }

    private void mod(){
        first = editText1.getText().toString();
        second = editText2.getText().toString();
        f = Integer.parseInt(first);
        s = Integer.parseInt(second);
        total = f%s;
        result.setText(String.valueOf(total));
    }
}