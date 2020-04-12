package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner scanner = new Scanner(System.in);
    private double tip = 0;
    private double bill = 0;
    private double total = 0;
    private TextView tipAmount;
    private TextView totalAmount;
    private EditText billTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipAmount = (TextView) findViewById(R.id.tipAmountTextView);
        totalAmount = (TextView) findViewById(R.id.totalAmountTextView);
        billTotal = (EditText) findViewById(R.id.billTotalEditText);
        bill = Double.valueOf(billTotal.getText().toString());
    }

    public void calculate10(View view) {
        double billInitial = bill;
        tip = bill * 0.1;
        total = bill + tip;
        tipAmount.setText("Tip: "+ Double.toString(tip));
        totalAmount.setText("Total: "+ Double.toString(total));
        bill = billInitial;
    }

    public void calculate15(View view) {
        double billInitial = bill;
        tip = bill * 0.15;
        total = bill + tip;
        tipAmount.setText("Tip: "+ Double.toString(tip));
        totalAmount.setText("Total: "+ Double.toString(total));
        bill = billInitial;
    }

    public void calculate20(View view) {
        double billInitial = bill;
        tip = bill * 0.15;
        total = bill + tip;
        tipAmount.setText("Tip: "+ Double.toString(tip));
        totalAmount.setText("Total: "+ Double.toString(total));
        bill = billInitial;
    }
}
