package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selects extends AppCompatActivity {

    public Button mEasy_btn , mHard_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selects);


        mEasy_btn = (Button)findViewById(R.id.Easy_btn);
        mHard_btn = (Button)findViewById(R.id.Hard_btn);

        mEasy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent easyPage = new Intent(Selects.this ,quiz_easy_activity.class);
                startActivity(easyPage);
                //    startActivity(new Intent(Select.this , quiz_kolay_activity.class));

            }
        });

        mHard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hardPage = new Intent(Selects.this ,quiz_hard_activity.class);
                startActivity(hardPage);
                //     startActivity(new Intent(Select.this , quiz_hard_activity.class));

            }
        });

    }
}