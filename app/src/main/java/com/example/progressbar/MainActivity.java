package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
 private int CurrentProgress=0;
 private ProgressBar progressBar;
  private Button StartProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.ProgressBar);
        StartProgress=findViewById(R.id.startProgress);
        CountDownTimer countDownTimer=new CountDownTimer(11*1000,1000) {
            @Override
            public void onTick(long l) {
                CurrentProgress=CurrentProgress+10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
            }
            @Override
            public void onFinish() {
            }
        };
        StartProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.start();
            }
        });
    }
}