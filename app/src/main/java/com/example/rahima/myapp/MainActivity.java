package com.example.rahima.myapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText name,passwr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn=(Button)findViewById(R.id.loginButtonId);

        name=(EditText) findViewById(R.id.nameEdittextId);
        passwr=(EditText)findViewById(R.id.passwordEdittextId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("Rahi") && passwr.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG);
                    Intent myintent=new Intent(MainActivity.this,MainActivity_2.class);
                    startActivity(myintent);

                }

            }
        });
    }
}
