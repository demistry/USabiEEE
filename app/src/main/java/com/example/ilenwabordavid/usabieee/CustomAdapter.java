package com.example.ilenwabordavid.usabieee;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private String [] Questions;
    private String[] Answers;
    public CustomAdapter(String [] Questions, String [] answers){
        this.Questions = Questions;
        this.Answers=answers;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        ViewHolder viewHold= new ViewHolder(view);
        return viewHold;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.textView.setText(Questions[position]);
        holder.editText.setHint(Answers[position]);
    }

    @Override
    public int getItemCount() {

        return Questions.length;
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;
        private final EditText editText;
        public ViewHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.question);
            editText = (EditText) view.findViewById(R.id.edit);
        }
    }
}
