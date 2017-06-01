package com.example.ilenwabordavid.usabieee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

public class TriviaActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private CustomAdapter myOwn;
    LinearLayoutManager linearLayoutManager;
    private String [] Questions={"What is your name","How old are u","Why are you here","Do u like me","Wetin de do u",
            "Your mat no","Your fav friend","Your mum","Your dad"};
    private String[] Answers ={"David","21","School","Yes","Nothing","Eng1303531","Laura","Fine","Sweet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_activity);
        final RecyclerView mRecycler =(RecyclerView) findViewById(R.id.rv);
        myOwn= new CustomAdapter(Questions, Answers);
        mRecycler.setLayoutManager(new LinearLayoutManager(TriviaActivity.this));
        mRecycler.setAdapter(new CustomAdapter(Questions, Answers));
       try {
           mRecycler.setLayoutManager(new LinearLayoutManager(this));
           mRecycler.setAdapter(new CustomAdapter(Questions, Answers));
       }
       catch (NullPointerException ex){
           Toast.makeText(this,"E no work", Toast.LENGTH_SHORT).show();
       }

    }
}
