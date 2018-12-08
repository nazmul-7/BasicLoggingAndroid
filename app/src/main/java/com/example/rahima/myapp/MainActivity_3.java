package com.example.rahima.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import com.example.rahima.myapp.AuthenticationHelper.LogoutActivity;

public class MainActivity_3 extends AppCompatActivity{

    private Button goalbtn, diarybtn, healthtipsbtn, videobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        goalbtn = findViewById(R.id.goalbtnId);
        diarybtn = findViewById(R.id.dairybtnId);
        healthtipsbtn = findViewById(R.id.healthtipsbtnId);
        videobtn = findViewById(R.id.videobtnId);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.shareId) {

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/type");
            String subject = "Stay Fit App";
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            startActivity(Intent.createChooser(intent, "Share with..."));

        } else if (item.getItemId() == R.id.aboutusId) {

            Intent intent = new Intent(getApplicationContext(), AboutUsActivity.class);
            startActivity(intent);

        } else if (item.getItemId() == R.id.feedbackId) {

            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);


        } else if (item.getItemId() == R.id.logoutId) {

            Intent intent = new Intent(getApplicationContext(), LogoutActivity.class);
            startActivity(intent);
        }


            return super.onOptionsItemSelected(item);

        }

}

