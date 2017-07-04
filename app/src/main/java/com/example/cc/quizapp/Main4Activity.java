package com.example.cc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main4);

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

        if (radio.getId() == R.id.peterMokaba) {

            score = 0;
            // message="incorrect!";
        } else if (radio.getId() == R.id.SoccerCity) {

            score = 1;
            //  message="incorrect!";
        } else if (radio.getId() == R.id.greenPoint) {

            score = 0;
            //message="incorrect!";
        } else if (radio.getId() == R.id.orlando) {

            score = 0;
            // message="Correct!";
        }


        if (radio2.getId() == R.id.reyaad) {

            score2 = 0;
            // message="Incorrect !";
        } else if (radio2.getId() == R.id.bruceBvuma) {

            score2 = 0;
            // message=" Incorrect!";
        } else if (radio2.getId() == R.id.Brilliant) {

            score2 = 0;
            // message="Incorrect!";
        } else if (radio2.getId() == R.id.Khune) {

            score2 = 1;
            // message="Correct!";
        }


        if (radio3.getId() == R.id.sphiwe) {

            score3 = 1;
            // message="Incorrect!";
        } else if (radio3.getId() == R.id.ronaldinho) {

            score3 = 0;
            //message="Correct!";
        } else if (radio3.getId() == R.id.villa) {

            score3 = 0;
            // message="Incorrect!";
        } else if (radio3.getId() == R.id.messi) {

            score3 = 0;
            // message="Incorrect!";
        }

        if (radio4.getId() == R.id.sphiwe) {

            score4 = 0;
            //message="Incorrect!";
        } else if (radio4.getId() == R.id.benny) {

            score4 = 1;
            //message="Correct!";
        } else if (radio4.getId() == R.id.lucas) {

            score4 = 0;
            // message="Incorrect!";
        } else if (radio4.getId() == R.id.doctor) {

            score4 = 0;
            //message="Incorrect!";
        }
        answer = score + score2 + score3 + score4;

        Toast.makeText(Main4Activity.this, "your answer is " + answer + " " + "out of 4", Toast.LENGTH_LONG).show();
    }

    public void back(View view) {

        Intent i = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(i);
    }
}