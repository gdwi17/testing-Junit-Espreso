package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText a,b,hasil;
    private Button btntambah,btnbagi,btnkurang,btnkali;
    private int x1,x2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        btntambah=findViewById(R.id.btntambah);
        btnbagi=findViewById(R.id.btnbagi);
        btnkurang=findViewById(R.id.btnkurang);
        btnkali=findViewById(R.id.btnkali);
        hasil=findViewById(R.id.hasil);


        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1 = Integer.valueOf(a.getText().toString());
                x2= Integer.valueOf(b.getText().toString());
                hasil.setText(function_tambah(x1,x2));
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1 = Integer.valueOf(a.getText().toString());
                x2 = Integer.valueOf(b.getText().toString());
                hasil.setText(kurang(x1,x2));
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1= Integer.valueOf(a.getText().toString());
                x2 = Integer.valueOf(b.getText().toString());

                hasil.setText(kali(x1,x2));
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1 = Integer.valueOf(a.getText().toString());
                x2 = Integer.valueOf(b.getText().toString());
                 hasil.setText(bagi(x1,x2));
            }
        });

    }
    String function_tambah(int a1, int b1){
        int hasil1 = a1 + b1;
        return String.valueOf(hasil1);
    }
    String kali(int a1, int b1){
        int hasil1 = a1 * b1;
        return String.valueOf(hasil1);
    }
    String kurang (int a1, int b1){
        int hasil1 = a1 - b1;
        return String.valueOf(hasil1);
    }
    String bagi (int a1, int b1){
        int hasil1 = a1 / b1;
        return String.valueOf(hasil1);
    }
}
