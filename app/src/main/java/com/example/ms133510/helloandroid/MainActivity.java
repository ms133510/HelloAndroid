package com.example.ms133510.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;  //Import log

public class MainActivity extends AppCompatActivity {
    public static String MA = "MainActivity";   //main activity string
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Integer is input here. Tied to our resources
        Log.w(MA,"View resources:" + R.layout.activity_main);

        int count = 0;
        for(int i = 0; i < 3; i++){
            count++;
        }
    }
}
