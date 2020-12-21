package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity
{
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "What is the average of first 150 natural numbers?",
            "0.003 × 0.02 = ?",
            "What is the average of the numbers: 0, 0, 4, 10, 5, and 5",
            "What is the rate of discount if a car which price was $4,000 was sold for $3,200 ?",
            "|–4| + |4| – 4 + 4 = ?",
            "What is the value of x in the equation 3x – 15 – 6 = 0 ?",
            "In a century how many months are there?",
            "A train travels 225 km in 3.5 hours and 370 km in 5 hours. Find the average speed of train.",
            "The average age of five members of a family is 21 years. If the age of the grandfather be included, the average is increased by 9 years. The age of the grandfather is:",
            "How many seconds longer does it take to drive 1 mile at 40 miles per hour than at 60 miles per hour?"
    };
    String answers[] = {"75.5","0.00006","4","20%","8","7","1200","70 km/hr","75 years","30"};
    String opt[] = {
            "70","70.5","75","75.5",
            "0.06","0.006","0.0006","0.00006",
            "2","3","4","5",
            "14%","16%","18%","20%",
            "0","2","4","8",
            "7","8","9","-9",
            "12","120","1200","1200",
            "70 km/hr","60 km/hr","90 km/hr","80 km/hr",
            "72 years","75 years","84 years","66 years",
            "35","45","15","30"
    };
    int index =0;
    public static int marks=0,correct=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);







        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[index]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[index])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(getApplicationContext(), "Wrong and correct is "+answers[index], Toast.LENGTH_SHORT).show();
                }

                index++;



                if(index <questions.length)
                {
                    tv.setText(questions[index]);
                    rb1.setText(opt[index *4]);
                    rb2.setText(opt[index *4 +1]);
                    rb3.setText(opt[index *4 +2]);
                    rb4.setText(opt[index *4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),Answer.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Answer.class);
                startActivity(intent);
            }
        });
    }

}