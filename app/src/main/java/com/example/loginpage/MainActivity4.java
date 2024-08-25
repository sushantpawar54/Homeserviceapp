package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button BUT1;
    Button BUT2;
    Button BUT3;
    Button BUT4;
    Button BUT5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        BUT1=findViewById(R.id.button6);
        BUT2=findViewById(R.id.button7);
        BUT3=findViewById(R.id.button8);
        BUT4=findViewById(R.id.button9);
        BUT5=findViewById(R.id.button10);
        BUT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        BUT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(intent);
            }
        });
        BUT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        BUT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        BUT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        });


    }



}