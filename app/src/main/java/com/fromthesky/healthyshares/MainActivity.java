package com.fromthesky.healthyshares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            EditText emotionLog = findViewById(R.id.edit_text_describe);

            Button happyButton = findViewById(R.id.button_happy);
            Button sadButton = findViewById(R.id.button_sadness);
            Button angerButton = findViewById(R.id.button_Anger);
            Button anxietyButton = findViewById(R.id.button_anxiety);


            happyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent happyIntent = new Intent(MainActivity.this, Happy.class);


                    startActivity(happyIntent);

                }
            });

            sadButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent sadIntent = new Intent(MainActivity.this, Sadness.class);

                    startActivity(sadIntent);

                }
            });

            angerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent angerIntent = new Intent(MainActivity.this, Anger.class);

                    startActivity(angerIntent);

                }
            });


            anxietyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent anxiousIntent = new Intent(MainActivity.this, Anxiety.class);

                    startActivity(anxiousIntent);
                }
            });

        }

        }
