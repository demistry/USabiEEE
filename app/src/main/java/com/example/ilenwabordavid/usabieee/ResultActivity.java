package com.example.ilenwabordavid.usabieee;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private Button mainMenu;
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
        ImageView imageView = (ImageView) findViewById(R.id.result_image);
        mainMenu = (Button) findViewById(R.id.return_button);
        mainMenu.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(ResultActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }
        );
        if (receivedResult >= 4.50){
            review.setText("Baddest " + name + ", first Class Student,         Keep it up...");
            imageView.setImageResource(R.drawable.happy);
            review.setTextColor(Color.BLUE);
        }
        if ((receivedResult<=4.49) && (receivedResult>=3.5)){
            review.setText("Second Class Upper(not bad), A slight improvement needed, buckle up " + name + ".");
            imageView.setImageResource(R.drawable.second_face);
            review.setTextColor(Color.GREEN);
        }
        if ((receivedResult<=3.49) && (receivedResult>=2.5)){
            review.setText("Hmm nawao. " + name+ " you are declining and on a second class lower o, Improve.");
            review.setTextColor(Color.MAGENTA);
            imageView.setImageResource(R.drawable.third_face);
        }
        if (receivedResult <= 2.49){
            review.setText("Hmm, see your life " + name + " are you sure you are a student, better change before you ruin your life.");
            review.setTextColor(Color.RED);
            imageView.setImageResource(R.drawable.fourth_face);
        }
    }
}
