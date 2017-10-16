package com.example.android.sample_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.debuglevel.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtils.d("This is test debug message");
    }
}
