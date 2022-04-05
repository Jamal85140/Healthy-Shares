package com.fromthesky.healthyshares;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   public Button anxietyButton;
    public Button happyButton;
   public  Button sadButton;
    public Button angerButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        anxietyButton = findViewById(R.id.button_anxiety);
        happyButton = findViewById(R.id.button_happy);
        sadButton = findViewById(R.id.button_sadness);
        angerButton = findViewById(R.id.button_Anger);


        anxietyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setMessage("Are you sure you are feeling anxious?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent anxietyIntent = new Intent(MainActivity.this, Anxiety.class);
                                startActivity(anxietyIntent);
                            }


                        }).setNegativeButton("No", null);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                    }
                 });


                happyButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                        builder.setMessage("Are you sure you are feeling Happy?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent happyIntent = new Intent(MainActivity.this, Happy.class);
                                        startActivity(happyIntent);
                                    }
                                }).setNegativeButton("No", null);

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();


                    }
                });

                sadButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                        builder.setMessage("Are you sure you are feeling sad?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent sadIntent = new Intent(MainActivity.this, Sadness.class);
                                        startActivity(sadIntent);
                                    }
                                }).setNegativeButton("No", null);

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();



                    }
                });

                angerButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                        builder.setMessage("Are you sure you are feeling Angry?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent angerIntent = new Intent(MainActivity.this, Anger.class);
                                        startActivity(angerIntent);
                                    }
                                }).setNegativeButton("No", null);

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();



                    }
                });

            }

        }