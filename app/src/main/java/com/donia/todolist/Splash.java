package com.donia.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    public Handler mWaitHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                try {

                    openNexteScreen();
                    finish();
                }catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 5000);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        //Remove all the callbacks otherwise navigation will execute even after activity is killed or closed.
        mWaitHandler.removeCallbacksAndMessages(null);
    }
    private void openNexteScreen() {
        SharedPreferences sharedPref =  getSharedPreferences(Constants.MY_PREF, Context.MODE_PRIVATE);
        boolean is_connected = sharedPref.getBoolean(Constants.PREF_IS_CONNECTED,false);
        if(is_connected){
            startActivity(new Intent(Splash.this,Home.class));
        }
        else
        {
            startActivity(new Intent(Splash.this,LogIn.class));

        }
    }

}