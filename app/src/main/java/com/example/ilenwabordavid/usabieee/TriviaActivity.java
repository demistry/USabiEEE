package com.example.ilenwabordavid.usabieee;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    private JSONObject jSons;
    private List<String> radio = new ArrayList<String>();
    private RecyclerView mRecycler;
    private int count=0;
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
    protected void onCreate(Bundle savedInstanceState) {
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
                   String correctAns = answer.getString("correct_ans");
                       ques.put("Question", Q);
                       ques.put("optionA", optionA);
                       ques.put("optionB", optionB);
                       ques.put("optionC", optionC);
                       ques.put("optionD", optionD);
                       ques.put("correctAns",correctAns );
                   radio.add(correctAns);

                   data.add(ques);
                   Collections.shuffle(data);
               }

           } catch (JSONException json) {
               Toast.makeText(this, "No Quiz Found", Toast.LENGTH_SHORT).show();
           }
         mRecycler =(RecyclerView) findViewById(R.id.rv);
        myOwn= new CustomAdapter(data, new CustomAdapter.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int click=0;
                RadioButton radioButton = (RadioButton) group.findViewById(group.getCheckedRadioButtonId());
                String rad = radioButton.getText().toString();
                if (radio.contains(rad)){
                    if (radioButton.isChecked()){click++;
                    count+=click;
                    group.setOnCheckedChangeListener(null);}
                   }
            }
        });
        mRecycler.setLayoutManager(new LinearLayoutManager(TriviaActivity.this));
        mRecycler.setAdapter(myOwn);
    }




}
