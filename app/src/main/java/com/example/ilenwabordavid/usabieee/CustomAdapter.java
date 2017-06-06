package com.example.ilenwabordavid.usabieee;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import java.util.HashMap;
import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<HashMap<String,String>> data;
    private OnCheckedChangeListener listener;
    public interface OnCheckedChangeListener{
        void onCheckedChanged(RadioGroup group, int checkedId);
    }

    public CustomAdapter(List<HashMap<String,String>> data, OnCheckedChangeListener listener){
        this.data=data;
        this.listener=listener;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        ViewHolder viewHold= new ViewHolder(view);
        return viewHold;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.bind(data.get(position),listener);
        HashMap<String,String> current=data.get(position);
        String correctAns = current.get("correctAns");
        holder.textView.setText(current.get("Question"));
        holder.radioButton1.setText(current.get("optionA"));
        holder.radioButton2.setText(current.get("optionB"));
        holder.radioButton3.setText(current.get("optionC"));
        holder.radioButton4.setText(current.get("optionD"));
    }

    @Override
    public int getItemCount() {

        return 10;
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private RadioButton radioButton3;
        private RadioButton radioButton4;
        private RadioGroup radioGroup;
        private String radio;

        public ViewHolder(View view) {
            super(view);
            radioGroup = (RadioGroup) view.findViewById(R.id.rad);
            textView = (TextView) view.findViewById(R.id.question);
            radioButton1 = (RadioButton) view.findViewById(R.id.radio1);
            radioButton2 = (RadioButton) view.findViewById(R.id.radio2);
            radioButton3 = (RadioButton) view.findViewById(R.id.radio3);
            radioButton4 = (RadioButton) view.findViewById(R.id.radio4);
        }

        public void bind(final HashMap item, final OnCheckedChangeListener listener) {
            radioGroup.setOnCheckedChangeListener(
                    new RadioGroup.OnCheckedChangeListener() {
                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                            listener.onCheckedChanged(group, checkedId);
                        }
                    }
            );
        }
    }
}
