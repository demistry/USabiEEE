package com.example.ilenwabordavid.usabieee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {
    private Spinner spinner1;
    private Spinner spinner2;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;
    private Spinner spinner6;
    private Spinner spinner7;
    private Spinner spinner8;
    private Spinner spinner9;
    private String name;
    Calc calc = new Calc();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Bundle loginIntent= getIntent().getExtras();
        name = loginIntent.getString("Username");//get name details from activity that called Calculator
        spinner1=(Spinner) findViewById(R.id.spinner1);
        String spin1 = String.valueOf(spinner1.getSelectedItem());
        spinner2=(Spinner) findViewById(R.id.spinner2);
        String spin2 = String.valueOf(spinner2.getSelectedItem());
        spinner3=(Spinner) findViewById(R.id.spinner3);
        String spin3 = String.valueOf(spinner3.getSelectedItem());
        spinner4=(Spinner) findViewById(R.id.spinner4);
        String spin4 = String.valueOf(spinner4.getSelectedItem());
        spinner5=(Spinner) findViewById(R.id.spinner5);
        String spin5 = String.valueOf(spinner5.getSelectedItem());
        spinner6=(Spinner) findViewById(R.id.spinner6);
        String spin6 = String.valueOf(spinner6.getSelectedItem());
        spinner7=(Spinner) findViewById(R.id.spinner7);
        String spin7 = String.valueOf(spinner7.getSelectedItem());
        spinner8=(Spinner) findViewById(R.id.spinner8);
        String spin8 = String.valueOf(spinner8.getSelectedItem());
        spinner9=(Spinner) findViewById(R.id.spinner9);
        String spin9 = String.valueOf(spinner9.getSelectedItem());

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE431(spinner1.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE433(spinner2.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setELA401(spinner3.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE451(spinner4.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE453(spinner5.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter6 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
        spinner6.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setCED400(spinner6.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter7 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter1);
        spinner7.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE471(spinner7.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter8 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter1);
        spinner8.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE473(spinner8.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        ArrayAdapter adapter9 = ArrayAdapter.createFromResource(this,R.array.Grades,android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner9.setAdapter(adapter1);
        spinner9.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView parent,View view, int pos, long id){
                        calc.setEEE481(spinner9.getItemAtPosition(pos).toString());
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );
        Button calculateButton = (Button) findViewById(R.id.buttonCalculateGP);
        calculateButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        double GPResult = Calc.calculateGP();
                        Intent resultIntent=  new Intent(Calculator.this, ResultActivity.class);
                        resultIntent.putExtra("RESULT", GPResult);
                        resultIntent.putExtra("Name",name);
                        startActivity(resultIntent);
                    }
                }
        );


        Button eee431Button = (Button) findViewById(R.id.button431);
        eee431Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee431Description);
                        dialog.setTitle("EEE-431");
                        dialog.show();
                    }
                }
        );
        Button eee433Button = (Button) findViewById(R.id.button433);
        eee433Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee433Description);
                        dialog.setTitle("EEE-433");
                        dialog.show();
                    }
                }
        );
        Button ela401Button = (Button) findViewById(R.id.button401);
        ela401Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.ela401Description);
                        dialog.setTitle("ELA-401");
                        dialog.show();
                    }
                }
        );
        Button eee451Button = (Button) findViewById(R.id.button451);
        eee451Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee451Description);
                        dialog.setTitle("EEE-451");
                        dialog.show();
                    }
                }
        );
        Button eee453Button = (Button) findViewById(R.id.button453);
        eee453Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee453Description);
                        dialog.setTitle("EEE-453");
                        dialog.show();
                    }
                }
        );
        Button ced400Button = (Button) findViewById(R.id.button400);
        ced400Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.ced400Description);
                        dialog.setTitle("CED-400");
                        dialog.show();
                    }
                }
        );
        Button eee471Button = (Button) findViewById(R.id.button471);
        eee471Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee471Description);
                        dialog.setTitle("EEE-471");
                        dialog.show();
                    }
                }
        );
        Button eee473Button = (Button) findViewById(R.id.button473);
        eee473Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee473Description);
                        dialog.setTitle("EEE-473");
                        dialog.show();
                    }
                }
        );
        Button eee481Button = (Button) findViewById(R.id.button481);
        eee481Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Dialog dialog = new Dialog(Calculator.this,android.R.style.Theme_Dialog);
                        dialog.setContentView(R.layout.pop_up_layout);
                        TextView textView = (TextView) dialog.findViewById(R.id.popUpText);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        textView.setText(R.string.eee481Description);
                        dialog.setTitle("EEE-481");
                        dialog.show();
                    }
                }
        );
    }
}
