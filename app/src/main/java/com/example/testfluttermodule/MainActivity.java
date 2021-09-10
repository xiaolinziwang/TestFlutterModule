package com.example.testfluttermodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onJumpToFlutter(View view) {
        try {
            startActivity(FlutterActivity.createDefaultIntent(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}