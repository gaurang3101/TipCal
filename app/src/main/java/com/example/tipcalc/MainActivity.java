package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private int tip = 0;
    private TextView tip10;
    Scanner scanner = new Scanner(System.in);
    private EditText billTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tip10 = (TextView) findViewById(R.id.tipAmountTextView);
        billTotal = (EditText) findViewById(R.id.billTotalEditText);
    }

    public void calculate10(View view) {

    }

    public void calculate15(View view) {
    }

    public void calculate20(View view) {
    }
}
