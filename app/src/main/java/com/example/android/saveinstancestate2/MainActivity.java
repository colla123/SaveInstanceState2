package com.example.android.saveinstancestate2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mCounter = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activity is created", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onCreate");

        if (savedInstanceState != null){
            mCounter = savedInstanceState.getInt("MyCounter");
        } else {
            mCounter = 0;
        }

        final TextView no =  findViewById(R.id.txt_counter);
        no.setText(String.valueOf(mCounter));

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = mCounter + 1;
                no.setText(String.valueOf(mCounter));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity is started", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(this, "Activity is Restarted", Toast.LENGTH_SHORT).show();
        Log.i("onRestart():","Activity Restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity is Resumed", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity is Paused", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity is Stopped", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity is Destroyed", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "Activity is Save Instance State", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onSaveInstanceState");
        outState.putInt("MyCounter", mCounter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "Activity is Restore Instance State", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onRestoreInstanceState");
    }
}