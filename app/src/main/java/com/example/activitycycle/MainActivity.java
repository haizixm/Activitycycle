package com.example.activitycycle;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="out" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate is Called");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"onPause is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy is Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestert is Called");
    }
}
