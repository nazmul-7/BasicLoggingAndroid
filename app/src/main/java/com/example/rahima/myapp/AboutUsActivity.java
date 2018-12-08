package com.example.rahima.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
