package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result_easy_Activity extends AppCompatActivity {

    private  TextView grade_easy, outOf_easy;
    private Button retry_easy;
    private ImageView imageView_result_easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_easy);

        grade_easy = (TextView) findViewById(R.id.grade_easy);
        outOf_easy = (TextView) findViewById(R.id.outOf_easy);
        imageView_result_easy = (ImageView)findViewById(R.id.imageView_result_easy);
        retry_easy = (Button) findViewById(R.id.retry_easy);
        retry_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result_easy_Activity.this , Selects.class));
            }
        });

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        outOf_easy.setText("You Scored" +" "+ score + " "+ "out Of" + QuizBook_easy.questions_easy.length);

        if (score == QuizBook_easy.questions_easy.length) {
            grade_easy.setText("OUTSTANDING");
            imageView_result_easy.setImageResource(R.drawable.ic_action_odul);
            outOf_easy.setText("You Scored" + "  " +10+ " "+ "out Of" + QuizBook_easy.questions_easy.length);

        }

        else if(score <=QuizBook_easy.questions_easy.length / 2){
            grade_easy.setText("GOOD  !");
            imageView_result_easy.setImageResource(R.drawable.ic_action_bad);
            outOf_easy.setText("You Scored" + "  "+6+" " + "out Of" + QuizBook_easy.questions_easy.length);
        }


    }
    }
