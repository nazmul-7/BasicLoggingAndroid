package com.example.rahima.myapp.AuthenticationHelper;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.rahima.myapp.R;


public class LogoutActivity extends AppCompatActivity implements View.OnClickListener {
    private Button LogOutButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        LogOutButton = findViewById(R.id.LogOutButtonId);
        LogOutButton.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        alertDialogBuilder= new AlertDialog.Builder(LogoutActivity.this);
        alertDialogBuilder.setTitle("Alert Dialog");
        alertDialogBuilder.setMessage("Do you want to Logout");
        alertDialogBuilder.setIcon(R.drawable.ic_live_help_black_24dp);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent intent = new Intent(LogoutActivity.this,LoginActivity.class);
                  startActivity(intent);


            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent intent = new Intent(LogoutActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}
