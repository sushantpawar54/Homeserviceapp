package com.example.loginpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    EditText edit00,edit1,edit2,edphone;
    Button butoke;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        edit00=findViewById(R.id.textView15);
        edit1=findViewById(R.id.textView14);
        edit2=findViewById(R.id.textView17);
        edphone=findViewById(R.id.textView16);
        butoke=findViewById(R.id.button11);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU){
            if(ContextCompat.checkSelfPermission(MainActivity5.this,Manifest.permission.POST_NOTIFICATIONS)
            !=PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(MainActivity5.this,new String[]{Manifest.permission.POST_NOTIFICATIONS},101);
            }
        }
                butoke.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        notification();
                        if(ContextCompat.checkSelfPermission(MainActivity5.this, Manifest.permission.SEND_SMS)==
                                PackageManager.PERMISSION_GRANTED){
                           // sendSMS();
                            sendSMS1();
                        }
                        else {
                            ActivityCompat.requestPermissions(MainActivity5.this,new String[]{Manifest.permission.SEND_SMS},100);
                        }
                        MainActivity5.this.finish();
                    }
                });
    }
    public void notification(){

        String chantel="CHANNL_ID_NOTIFICATION";
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),chantel);
        builder.setSmallIcon(R.drawable.baseline_notifications)
        .setContentTitle("Notification tilie")
        .setContentText("Thanks for booking servise on HOME SERVICE")
        .setAutoCancel(true).setPriority(NotificationCompat.PRIORITY_DEFAULT);
        Intent intent=new Intent(getApplicationContext(),MainActivity5.class);
        intent.addFlags((intent.FLAG_ACTIVITY_CLEAR_TOP));
        intent.putExtra("data","somedata");
        PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),0,intent,PendingIntent.FLAG_MUTABLE);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if(android.os.Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.O){
            NotificationChannel notificationChannel=notificationManager.getNotificationChannel(chantel);
            if(notificationChannel==null){
                int importance=NotificationManager.IMPORTANCE_HIGH;
                notificationChannel= new NotificationChannel(chantel,"some did",importance);
                notificationChannel.setLightColor(Color.GREEN);
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        notificationManager.notify(0,builder.build());
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults.length > 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED) {
           // sendSMS();
            sendSMS1();
        }
        else {
            Toast.makeText(this,"permission Denide!",Toast.LENGTH_SHORT).show();
        }
    }
    private void sendSMS1(){
        String name="name of client:";
        String nameclient=edit00.getText().toString();
        String Phoneofownar="7498366376";
        String mss="address of client:";
        String addressofclient=edit1.getText().toString();
        String mss1="provided service is:";
        String service=edit2.getText().toString();
        SmsManager smsManager3=SmsManager.getDefault();
        smsManager3.sendTextMessage(Phoneofownar,null,name,null,null);
        SmsManager smsManager4=SmsManager.getDefault();
        smsManager4.sendTextMessage(Phoneofownar,null,nameclient,null,null);
        SmsManager smsManager=SmsManager.getDefault();
        SmsManager ssmsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(Phoneofownar,null,mss,null,null);
        ssmsManager.sendTextMessage(Phoneofownar,null,addressofclient,null,null);
        SmsManager ss1msManager=SmsManager.getDefault();
        ss1msManager.sendTextMessage(Phoneofownar,null,mss1,null,null);
        SmsManager ss2msManager=SmsManager.getDefault();
        ss2msManager.sendTextMessage(Phoneofownar,null,service,null,null);

    }

   /* private void sendSMS() {

       // String Phoneofclint=edphone.getText().toString();
        String Phoneofclint="7498366376";
        String servicename=edit2.getText().toString();
        String thanck="Thanks for booking servise on HOME SERVICE";
        Toast.makeText(this,"sms sent successfully",Toast.LENGTH_SHORT).show();
        SmsManager ss1msManager=SmsManager.getDefault();
        ss1msManager.sendTextMessage(Phoneofclint,null,thanck,null,null);
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage(Phoneofclint,null,servicename,null,null);
    }*/
}