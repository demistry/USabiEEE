package com.example.ilenwabordavid.usabieee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizResultActivity extends AppCompatActivity {
    private Button mainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        ImageView imageView=(ImageView) findViewById(R.id.result_image);
        TextView quizResult= (TextView) findViewById(R.id.resultDisplay);
        TextView review = (TextView) findViewById(R.id.review);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Username");
        int score = bundle.getInt("Score");
        if ((score>=0) && (score<=2)){
            imageView.setImageResource(R.drawable.range1);
            quizResult.setText(name+" your quiz score is super poor.");
            review.setText("Clear say you no de go class, you no sabi anything.");
        }
        if ((score>=3) && (score <=4)){
            imageView.setImageResource(R.drawable.range2);
            quizResult.setText(name+" your quiz score is poor.");
            review.setText("You de go class small, but you no still sabi anything.");
        }
        if ((score>=5) && (score <=6)){
            imageView.setImageResource(R.drawable.range3);
            quizResult.setText(name+" your quiz score try small.");
            review.setText("You de go class one kind, but you still gat know more.");
        }
        if ((score>=7) && (score <=8)){
            imageView.setImageResource(R.drawable.range4);
            quizResult.setText(name+" your quiz score is impressive.");
            review.setText("You de go class steady, but some gists are still hidden from you.");
        }
        if ((score>=9) && (score <=10)){
            imageView.setImageResource(R.drawable.range5);
            quizResult.setText(name+" your quiz score is excellent.");
            review.setText("You de go class steady and all gists are known to you.");
        }
        mainMenu = (Button) findViewById(R.id.return_button);
        mainMenu.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(QuizResultActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
