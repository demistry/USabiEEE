package com.example.ilenwabordavid.usabieee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private Button quizButton;
    private Button calculatorButton;
    private EditText username;
    private String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        quizButton = (Button) findViewById(R.id.quiz_button);
        calculatorButton= (Button) findViewById(R.id.calc_button);
        username = (EditText) findViewById(R.id.username);
        userName = username.getText().toString();

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