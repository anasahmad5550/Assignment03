package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Answer extends AppCompatActivity {
    TextView score;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        score = (TextView)findViewById(R.id.score);
        btnRestart = (Button) findViewById(R.id.btnRestart);


        StringBuffer stringbuff = new StringBuffer();
        stringbuff.append("Your Score is : " + Questions.correct + "/10");

        score.setText(stringbuff);

        Questions.correct=0;


        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }

}