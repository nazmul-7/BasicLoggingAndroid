package com.example.rahima.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.rahima.myapp.AuthenticationHelper.LoginActivity;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextView textView;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //title bar remove
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //notification bar remove
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        progressBar=(ProgressBar)findViewById(R.id.progressBarId);
        textView=(TextView) findViewById(R.id.text1);


        Thread thread=new Thread((new Runnable() {
            public void run() {

                doWork();
                startApp();
            }


        }));
        thread.start();
    }




    public void doWork() {

        for (progress = 10; progress <= 100; progress = progress + 10){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
    public void startApp(){
        Intent intent=new Intent(SplashScreen.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}


