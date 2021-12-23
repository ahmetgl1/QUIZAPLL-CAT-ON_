package com.example.ybs201735014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView)findViewById(R.id.username);
        TextView password = (TextView)findViewById(R.id.password);
        Button loginBtn =(Button)findViewById(R.id.login_btn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123")){

                    Intent i = new Intent(MainActivity.this , Selects.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS" , Toast.LENGTH_LONG).show();


                }
                else{
                    Toast.makeText(MainActivity.this, "LOGIN FAİLED !" , Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}