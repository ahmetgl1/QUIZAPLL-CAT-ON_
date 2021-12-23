package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz_hard_activity extends AppCompatActivity {

    private TextView mScoreView_hard , mQuestion_hard;
    private ImageView mImageView_hard;
    private ImageButton mTrueButton_hard , mFalseButton_hard;

    private boolean mAnswer_hard;
    private int mScore_hard = 0;
    private int mQuestionNumber_hard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_hard);


        mScoreView_hard = (TextView)findViewById(R.id.points_hard);
        mQuestion_hard = (TextView)findViewById(R.id.question_hard);
        mImageView_hard = (ImageView)findViewById(R.id.imageView_hard);
        mTrueButton_hard = (ImageButton)findViewById(R.id.trueButton_hard);
        mFalseButton_hard = (ImageButton)findViewById(R.id.falseButton_hard);




        updateQuestion();

        //True Button gelecek . .!
        mTrueButton_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswer_hard == true){
                    mScore_hard++;
                    updateScore(mScore_hard);

                    if(mQuestionNumber_hard ==QuizBook_hard.questions_hard.length){
                        Intent result = new Intent(quiz_hard_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_hard);
                        result.putExtras(bundle);
                        quiz_hard_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }
                }
                else{

                    if(mQuestionNumber_hard ==QuizBook_hard.questions_hard.length){
                        Intent result = new Intent(quiz_hard_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_hard);
                        result.putExtras(bundle);
                        quiz_hard_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }


                }


            }
        });

        //false Buton Onclick
        mFalseButton_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswer_hard == false){
                    mScore_hard++;
                    updateScore(mScore_hard);

                    if(mQuestionNumber_hard ==QuizBook_hard.questions_hard.length){
                        Intent result = new Intent(quiz_hard_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_hard);
                        result.putExtras(bundle);
                        quiz_hard_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }
                }
                else{

                    if(mQuestionNumber_hard ==QuizBook_hard.questions_hard.length){
                        Intent result = new Intent(quiz_hard_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_hard);
                        result.putExtras(bundle);
                        quiz_hard_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }


                }

            }
        });










    }
    private void updateQuestion(){
        mImageView_hard.setImageResource(QuizBook_hard.images_hard[mQuestionNumber_hard]);
        mQuestion_hard.setText(QuizBook_hard.questions_hard[mQuestionNumber_hard]);
        mAnswer_hard = QuizBook_hard.answer_hard[mQuestionNumber_hard];
        mQuestionNumber_hard++;
    }

    public void updateScore(int point){
        mScoreView_hard.setText("" + mScore_hard);

    }
}