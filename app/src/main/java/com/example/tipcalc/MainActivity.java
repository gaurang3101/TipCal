package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private double tip = 0;
    private double bill = 0;
    private double total = 0;
    private TextView tipAmount;
    private TextView totalAmount;
    private EditText billTotal;

    private double parseDouble(String s){
        if(s == null || s.isEmpty())
            return 0.0;
        else
            return Double.parseDouble(s);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipAmount = findViewById(R.id.tipAmountTextView);
        totalAmount = findViewById(R.id.totalAmountTextView);
        billTotal = findViewById(R.id.billTotalEditText);
        //billTotal.getText().toString();
        //bill = parseDouble(billTotal.getText().toString());
    }

    public void calculate10(View view) {
        bill = parseDouble(billTotal.getText().toString());
        double billInitial = bill;
        tip = bill * 0.1;
        total = bill + tip;
        String tipS = "Tip: " + tip;
        String totalS = "Total: " + total;
        tipAmount.setText(tipS);
        totalAmount.setText(totalS);
        bill = billInitial;
    }

    public void calculate15(View view) {
        bill = parseDouble(billTotal.getText().toString());
        double billInitial = bill;
        tip = bill * 0.15;
        total = bill + tip;
        String tipS = "Tip: " + tip;
        String totalS = "Total: " + total;
        tipAmount.setText(tipS);
        totalAmount.setText(totalS);
        bill = billInitial;
    }

    public void calculate20(View view) {
        bill = parseDouble(billTotal.getText().toString());
        double billInitial = bill;
        tip = bill * 0.20;
        total = bill + tip;
        String tipS = "Tip: " + tip;
        String totalS = "Total: " + total;
        tipAmount.setText(tipS);
        totalAmount.setText(totalS);
        bill = billInitial;
    }
}
