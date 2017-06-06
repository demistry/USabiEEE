package com.example.ilenwabordavid.usabieee;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Bundle resultIntent = getIntent().getExtras();
        double receivedResult =  resultIntent.getDouble("RESULT");
        String name = resultIntent.getString("Name");
        String result = String.valueOf(receivedResult);
        TextView GpResult= (TextView) findViewById(R.id.resultDisplay);
        TextView review = (TextView) findViewById(R.id.review);
        GpResult.setText(name+"'s" + " 400L GP is " + result);
        ImageView imageView = (ImageView) findViewById(R.id.faces);
        Button home = (Button) findViewById(R.id.home);
        if (receivedResult >= 4.50){
            review.setText("Boss " + name + ", first Class Boss,         Keep it up...");
            review.setTextColor(Color.BLUE);
        }
        if ((receivedResult<=4.49) && (receivedResult>=3.5)){
            review.setText("Second Class Upper(not bad), A slight improvement needed, buckle up " + name + ".");
            imageView.setImageResource(R.drawable.second_face);
            review.setTextColor(Color.GREEN);
        }
        if ((receivedResult<=3.49) && (receivedResult>=2.5)){
            review.setText("Hmm Baba " + name+ " you are declining and on a second class lower o, Improve.");
            review.setTextColor(Color.MAGENTA);
            imageView.setImageResource(R.drawable.third_face);
        }
        if (receivedResult <= 2.49){
            review.setText("Hmm, egbon " + name + " are you sure you are a student, better change before you ruin your life.");
            review.setTextColor(Color.RED);
            imageView.setImageResource(R.drawable.fourth_face);
        }

    }
}
