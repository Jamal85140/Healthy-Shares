package com.fromthesky.healthyshares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


    }
/*
    protected void onItemClick() {
        //update MainActivity.class as needed
        Intent intent = new Intent();
        intent.setClass(SettingsActivity.this, MainActivity.class);
        startActivity(intent);

    }
*/


    public String getAndroidVersion() {
        String release = Build.VERSION.RELEASE;
        int sdkVersion = Build.VERSION.SDK_INT;
        return "Android SDK: " + sdkVersion + " (" + release +")";

// make add button add to list
        //intents for home page
        //arraylist to fill listView
    }
}