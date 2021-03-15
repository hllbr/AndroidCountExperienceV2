package com.hllbr.countexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText ;
    String name ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        name = editText.getText().toString();


    }
    public void second(View view){
        name = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra("name",name);

        startActivity(intent);
    }

}