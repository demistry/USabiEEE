package com.example.ilenwabordavid.usabieee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TriviaActivity extends AppCompatActivity {
    private CustomAdapter myOwn;
    JSONObject jSons;
    public String loadJSONFromAsset() {
        String son;
        try{
            InputStream in = getResources().openRawResource(R.raw.question_answer);

            int size = in.available();

            byte[] buffer = new byte[size];

            in.read(buffer);
            in.close();
            son = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return son;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia_activity);
        List<HashMap<String,String>> data = new ArrayList();

           try {
               jSons = new JSONObject(loadJSONFromAsset());
               JSONArray questions = jSons.getJSONArray("questions");
               for (int i = 0; i <questions.length(); i++) {
                   HashMap<String, String> ques = new HashMap<>();
                   JSONObject question = questions.getJSONObject(i);
                   String Q = question.getString("q");
                   JSONObject answer = question.getJSONObject("ans");
                   String optionA = answer.getString("a");
                   String optionB = answer.getString("b");
                   String optionC = answer.getString("c");
                   String optionD = answer.getString("d");
                       ques.put("Question", Q);
                       ques.put("optionA", optionA);
                       ques.put("optionB", optionB);
                       ques.put("optionC", optionC);
                       ques.put("optionD", optionD);
                   data.add(ques);
                   Collections.shuffle(data);
               }

           } catch (JSONException json) {
               Toast.makeText(this, "No Quiz Found", Toast.LENGTH_SHORT).show();
           }
        final RecyclerView mRecycler =(RecyclerView) findViewById(R.id.rv);
        myOwn= new CustomAdapter(data);
        mRecycler.setLayoutManager(new LinearLayoutManager(TriviaActivity.this));
        mRecycler.setAdapter(myOwn);
    }

}
