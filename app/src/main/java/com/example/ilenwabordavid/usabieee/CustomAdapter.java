package com.example.ilenwabordavid.usabieee;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private HashMap map;
    private List<HashMap<String,String>> data;

    public CustomAdapter(List<HashMap<String,String>> data){
        this.data=data;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        ViewHolder viewHold= new ViewHolder(view);
        return viewHold;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        HashMap<String,String> current=data.get(position);
        holder.textView.setText(current.get("Question"));
        holder.radioButton1.setText(current.get("optionA"));
        holder.radioButton2.setText(current.get("optionB"));
        holder.radioButton3.setText(current.get("optionC"));
        holder.radioButton4.setText(current.get("optionD"));
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private RadioButton radioButton3;
        private RadioButton radioButton4;

        public ViewHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.question);
            radioButton1=(RadioButton) view.findViewById(R.id.radio1);
            radioButton2=(RadioButton) view.findViewById(R.id.radio2);
            radioButton3=(RadioButton) view.findViewById(R.id.radio3);
            radioButton4=(RadioButton) view.findViewById(R.id.radio4);
        }
    }
}
