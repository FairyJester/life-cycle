 package com.fairyparty.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


        public class MainActivity extends AppCompatActivity {

            Integer count = 0;

            private final static String TAG = "MainActivity";

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_main);
                Log.d(TAG, "onCreate");
            }
            @Override
            public void onRestoreInstanceState(Bundle savedInstanceState) {
                super.onRestoreInstanceState(savedInstanceState);
                if (savedInstanceState != null &&
                        savedInstanceState.containsKey("count")) {
                    count = savedInstanceState.getInt("count");
                }
                Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onRestoreInstanceState");
            }
            @Override
            protected void onDestroy(){
                super.onDestroy();
                Toast.makeText(this,"onDestroy()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy");
           }
             @Override
            protected void onStop(){
                super.onStop();
                Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onStop");
            }
            @Override
            protected void onStart(){
                super.onStart();
                Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onStart");
            }
            @Override
            protected void onPause(){
                super.onPause();
                Toast.makeText(this, "onParse()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onPause");
            }
            @Override
            protected void onResume(){
                super.onResume();
                Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onResume");
            }
            @Override
            public void onSaveInstanceState(Bundle outState) {
                        super.onSaveInstanceState(outState);
                        outState.putInt("count", count);
                        Toast.makeText(this, "onSavedInstanceState()", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onSaveInstanceState");
            }
            @Override
            protected void onRestart(){
                super.onRestart();
                Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
                Log.d(TAG, "onRestart");
            }
            private void resetUI() {
                        Toast.makeText(this, "resetUI()", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "resetUI");
            }
        }