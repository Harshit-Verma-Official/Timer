package com.example.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mnumber = (TextView) findViewById(R.id.mnumber);
        final TextView result = (TextView) findViewById(R.id.done);

        new CountDownTimer(30000,1000){
            public void onTick(long millisUntilFinished){
                mnumber.setText("Time : " + millisUntilFinished/1000);
            }
            public void onFinish(){
                result.setText("Done");
            }
        }.start();

    }
}
