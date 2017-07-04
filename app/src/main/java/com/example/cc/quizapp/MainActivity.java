package com.example.cc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bible(View view) {


        Intent i = new Intent(MainActivity.this, Main2ctivity.class);
        startActivity(i);
    }

    public void cars(View view) {

        Intent i = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(i);
    }

    public void sports(View view) {


        Intent i = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(i);
    }
}