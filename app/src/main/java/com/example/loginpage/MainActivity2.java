package com.example.loginpage;

import static com.example.loginpage.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our ";
    EditText ed1;
    EditText ed2;
    Button bu1;
    Button bu2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1 = findViewById(R.id.edit1);
        ed2 = findViewById(R.id.edit3);
        bu1 = findViewById(R.id.button2);
        bu2 = findViewById(R.id.button3);

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent1);

            }
        });
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    SharedPreferences creadentials=getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    String struser=creadentials.getString("username",null);
                    String strpassword=creadentials.getString("password",null);
                    String  usernsme=ed1.getText().toString();
                    String  pass=ed2.getText().toString();
                    if(struser!=null&&usernsme!=null&&struser.equalsIgnoreCase(usernsme)) {
                        if (strpassword != null && pass != null && strpassword.equalsIgnoreCase(pass)) {
                            Intent intent1 = new Intent(MainActivity2.this, MainActivity4.class);
                            startActivity(intent1);
                            Toast.makeText(MainActivity2.this,"login sucssefully",Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(MainActivity2.this,"login faild",Toast.LENGTH_SHORT).show();
                        }

                    }

                    else {
                        Toast.makeText(MainActivity2.this,"login faild",Toast.LENGTH_SHORT).show();

                    }
                    return;
            }
        });

    }
}

