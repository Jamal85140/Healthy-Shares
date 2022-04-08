package com.fromthesky.healthyshares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SettingsActivity extends AppCompatActivity {

    Button addbtn;
    EditText editText;
    ArrayList<String> alist;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Add Contact");

        listView = (ListView) findViewById(R.id.listView);
       addbtn = (Button) findViewById(R.id.addemailbtn);
       editText = (EditText) findViewById(R.id.email);

       alist = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_checked);

       addbtn.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               String names =  editText.getText().toString();

               alist.add(names);
               listView.setAdapter(arrayAdapter);
               arrayAdapter.notifyDataSetChanged();
           }
       });
    }


    protected void onItemClick() {
        //update MainActivity.class as needed
        Intent intent = new Intent();
        intent.setClass(SettingsActivity.this, MainActivity.class);
        startActivity(intent);

    }
   /* public void getData(View v){
        EditText contactName = (EditText) findViewById(R.id.email_add);
        String contactNameStr = contactName.getText().toString();
        contactName.save();


    }
*/

    public String getAndroidVersion() {
        String release = Build.VERSION.RELEASE;
        int sdkVersion = Build.VERSION.SDK_INT;
        return "Android SDK: " + sdkVersion + " (" + release +")";

// make add button add to list
        //intents for home page Done
        //arraylist to fill listView
    }   //information is store in variable text
    EditText inputText = (EditText)findViewById(R.id.email);
    public void store_email(View view) {
           String text = inputText.getText().toString();
        }
    }
