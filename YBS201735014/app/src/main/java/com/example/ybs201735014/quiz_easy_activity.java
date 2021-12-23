package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz_easy_activity extends AppCompatActivity {

    private TextView mScoreView_easy , mQuestion_easy;
    private ImageView mImageView_easy;
    private ImageButton mTrueButton_easy , mFalseButton_easy;

    private boolean mAnswer_easy;
    private int mScore_easy = 0;
    private int mQuestionNumber_easy = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_easy);


        mScoreView_easy = (TextView)findViewById(R.id.points_easy);
        mQuestion_easy = (TextView)findViewById(R.id.question_easy);
        mImageView_easy = (ImageView)findViewById(R.id.imageView_easy);
        mTrueButton_easy = (ImageButton)findViewById(R.id.trueButton_easy);
        mFalseButton_easy = (ImageButton)findViewById(R.id.falseButton_easy);




        updateQuestion();

        //True Button gelecek . .!
        mTrueButton_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswer_easy == true){
                    mScore_easy++;
                    updateScore(mScore_easy);

                    if(mQuestionNumber_easy ==QuizBook_easy.questions_easy.length){
                        Intent result = new Intent(quiz_easy_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_easy);
                        result.putExtras(bundle);
                        quiz_easy_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }
                }
                else{

                    if(mQuestionNumber_easy ==QuizBook_easy.questions_easy.length){
                        Intent result = new Intent(quiz_easy_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_easy);
                        result.putExtras(bundle);
                        quiz_easy_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }


                }


            }
        });

        //false Buton Onclick
        mFalseButton_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswer_easy == false){
                    mScore_easy++;
                    updateScore(mScore_easy);

                    if(mQuestionNumber_easy ==QuizBook_easy.questions_easy.length){
                        Intent result = new Intent(quiz_easy_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_easy);
                        result.putExtras(bundle);
                        quiz_easy_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }
                }
                else{

                    if(mQuestionNumber_easy ==QuizBook_easy.questions_easy.length){
                        Intent result = new Intent(quiz_easy_activity.this , Result_easy_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score :" , mScore_easy);
                        result.putExtras(bundle);
                        quiz_easy_activity.this.finish();
                        startActivity(result);
                    }else{
                        updateQuestion();
                    }


                }

            }
        });








    }
    private void updateQuestion(){
        mImageView_easy.setImageResource(QuizBook_easy.images_easy[mQuestionNumber_easy]);
        mQuestion_easy.setText(QuizBook_easy.questions_easy[mQuestionNumber_easy]);
        mAnswer_easy = QuizBook_easy.answer_easy[mQuestionNumber_easy];
        mQuestionNumber_easy++;
    }

    public void updateScore(int point){
        mScoreView_easy.setText("" + mScore_easy);

    }
}