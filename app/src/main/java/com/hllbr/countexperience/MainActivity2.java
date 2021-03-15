package com.hllbr.countexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView ;
    String name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        name =intent.getStringExtra("name");

    }
    public void runbutton(View view){

        new CountDownTimer(25000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                //her saniye yapılmasını istediklerim
                textView.setText("Dear "+name+" please wait "+millisUntilFinished/1000+" second left");
            }

            @Override
            public void onFinish() {
            //sayma işlemi bittiğinde yapılamsını istediklerim
                Toast.makeText(MainActivity2.this,"Done!",Toast.LENGTH_LONG).show();

                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        }.start();

    }
}