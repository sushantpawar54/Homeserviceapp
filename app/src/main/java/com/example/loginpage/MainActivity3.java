package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private final String CREDENTIAL_SHARED_PREF = "our ";
    Button but1;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText1=findViewById(R.id.editTextText2);
        editText2=findViewById(R.id.editTextText);
        editText3=findViewById(R.id.editTextText3);
        but1=findViewById(R.id.button4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strpass=editText2.getText().toString();
                String strcomf=editText3.getText().toString();
                String struser=editText1.getText().toString();
                if(strpass!=null&&struser!=null&&strpass.equalsIgnoreCase(strcomf)){
                    SharedPreferences creadentials=getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editer=creadentials.edit();
                    editer.putString("password",strpass);
                    editer.putString("username",struser);
                    editer.commit();
                    MainActivity3.this.finish();
                    Toast.makeText(MainActivity3.this,"register  sucssefully",Toast.LENGTH_SHORT).show();


                }


            }
        });






        //TextView =(TextView) findViewById(R.id.textView)
    }
}