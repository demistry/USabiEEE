package com.example.ilenwabordavid.usabieee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button quizButton = (Button) findViewById(R.id.quiz_button);
        final Button calculatorButton= (Button) findViewById(R.id.calc_button);
        EditText username = (EditText) findViewById(R.id.username);
        final String userName = username.getText().toString();

        quizButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent triviaIntent= new Intent(LoginActivity.this, TriviaActivity.class);
                        triviaIntent.putExtra("Username", userName);
                        startActivity(triviaIntent);
                    }
                }
        );
        calculatorButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent calculatorIntent= new Intent(LoginActivity.this, Calculator.class);
                        calculatorIntent.putExtra("Username",userName);
                        startActivity(calculatorIntent);
                    }
                }
        );
    }
}