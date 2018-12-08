package com.example.rahima.myapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity_2 extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup radioGroup;
    private RadioButton genderBtn;
    private Button goButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);


        goButton = (Button) findViewById(R.id.btn2Id);
        goButton.setOnClickListener(this);


        Spinner spinnerAge = (Spinner) findViewById(R.id.ageSpinnerId);
        Spinner spinnerWeight = (Spinner) findViewById(R.id.weightSpinnerId);
        Spinner spinnerHeight_1 = (Spinner) findViewById(R.id.height_1SpinnerId);
        Spinner spinnerHeight_2 = (Spinner) findViewById(R.id.height_2SpinnerId);




        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers_2,android.R.layout.simple_spinner_item);
       // ArrayAdapter<CharSequence> adapterHeight = ArrayAdapter.createFromResource(this,R.array.numbers_1,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAge.setAdapter(adapter);
        spinnerWeight.setAdapter(adapter);
        //spinnerHeight_1.setAdapter(adapter);
        //spinnerHeight_2.setAdapter(adapter);
    }


        @Override
        public void onClick (View v){

            Intent intent = new Intent(MainActivity_2.this, MainActivity_3.class);
            startActivity(intent);

        }
    }



