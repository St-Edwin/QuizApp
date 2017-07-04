package com.example.cc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {


    private RadioGroup group;
    private RadioButton radio;

    private RadioGroup group2;
    private RadioButton radio2;

    private RadioGroup group3;
    private RadioButton radio3;

    private RadioGroup group4;
    private RadioButton radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        group = (RadioGroup) findViewById(R.id.radioGroup1);

        group2 = (RadioGroup) findViewById(R.id.radioGroup2);

        group3 = (RadioGroup) findViewById(R.id.radioGroup3);

        group4 = (RadioGroup) findViewById(R.id.radioGroup4);
    }

    public void click(View view) {

        int selectid = group.getCheckedRadioButtonId();
        radio = (RadioButton) findViewById(selectid);

        int score = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;

        int answer = 0;

        int selectid2 = group2.getCheckedRadioButtonId();

        radio2 = (RadioButton) findViewById(selectid2);

        int selectid3 = group3.getCheckedRadioButtonId();
        radio3 = (RadioButton) findViewById(selectid3);

        int selectid4 = group4.getCheckedRadioButtonId();
        radio4 = (RadioButton) findViewById(selectid4);

        String message = "  ";

        if (radio.getId() == R.id.audi) {

            score = 0;
            // message="incorrect!";
        } else if (radio.getId() == R.id.Mercedez) {

            score = 1;
            //  message="incorrect!";
        } else if (radio.getId() == R.id.dodge) {

            score = 0;
            //message="incorrect!";
        } else if (radio.getId() == R.id.bmw) {

            score = 0;
            // message="Correct!";
        }


        if (radio2.getId() == R.id.AstonMartin) {

            score2 = 0;
            // message="Incorrect !";
        } else if (radio2.getId() == R.id.Bugatti) {

            score2 = 1;
            // message=" Incorrect!";
        } else if (radio2.getId() == R.id.Buik) {

            score2 = 0;
            // message="Incorrect!";
        } else if (radio2.getId() == R.id.Bentley) {

            score2 = 0;
            // message="Correct!";
        }


        if (radio3.getId() == R.id.Jeep) {

            score3 = 0;
            // message="Incorrect!";
        } else if (radio3.getId() == R.id.Toyota) {

            score3 = 1;
            //message="Correct!";
        } else if (radio3.getId() == R.id.volvo) {

            score3 = 0;
            // message="Incorrect!";
        } else if (radio3.getId() == R.id.chevrolet) {

            score3 = 0;
            // message="Incorrect!";
        }

        if (radio4.getId() == R.id.kia) {

            score4 = 1;
            //message="Incorrect!";
        } else if (radio4.getId() == R.id.mazda) {

            score4 = 0;
            //message="Correct!";
        } else if (radio4.getId() == R.id.nissan) {

            score4 = 0;
            // message="Incorrect!";
        } else if (radio4.getId() == R.id.tata) {

            score4 = 0;
            //message="Incorrect!";
        }
        answer = score + score2 + score3 + score4;

        Toast.makeText(Main3Activity.this, "your answer is " + answer + " " + "out of 4", Toast.LENGTH_LONG).show();
    }

    public void back(View view) {

        Intent i = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(i);
    }
}
