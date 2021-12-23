package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result_hard_Activity extends AppCompatActivity {
    private TextView grade_hard, outOf_hard;
    private Button retry_hard;
    private ImageView imageView_result_hard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_hard);

        grade_hard = (TextView) findViewById(R.id.grade_hard);
        outOf_hard = (TextView) findViewById(R.id.outOf_hard);
        imageView_result_hard = (ImageView)findViewById(R.id.imageView_result_hard);
        retry_hard = (Button) findViewById(R.id.retry_hard);
        retry_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result_hard_Activity.this , Selects.class));
            }
        });

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        outOf_hard.setText("You Scored" + score + "out Of" + QuizBook_hard.questions_hard.length);


        if (score == QuizBook_hard.questions_hard.length) {
            grade_hard.setText("OUTSTANDING");
            imageView_result_hard.setImageResource(R.drawable.ic_action_odul);
            outOf_hard.setText("You Scored" + "  " +10+ " "+ "out Of" + QuizBook_hard.questions_hard.length);

        }

        else if(score <=QuizBook_hard.questions_hard.length / 2){
            grade_hard.setText("GOOD  !");
            imageView_result_hard.setImageResource(R.drawable.ic_action_bad);
            outOf_hard.setText("You Scored" + "  "+6+" " + "out Of" + QuizBook_hard.questions_hard.length);
        }


    }
}