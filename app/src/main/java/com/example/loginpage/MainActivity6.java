package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    ImageView img,img1,img2,img3,img4,img5;
    Button b11;
    TextView t;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        img=findViewById(R.id.imageView10);
        img1=findViewById(R.id.imageView11);
        img2=findViewById(R.id.imageView13);
        img3=findViewById(R.id.imageView14);
        img4=findViewById(R.id.imageView16);
        img5=findViewById(R.id.imageView17);
        b11=findViewById(R.id.button12);
        t=findViewById(R.id.textView18);


        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);


            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);


            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(intent);
            }
        });


    }
}