package com.example.helix.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Changes the color of text from black to orange
        findViewById(R.id.textColorBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.orange));
            }
        });

        //Changes the background color from light blue to a darker shade of blue
        findViewById(R.id.backgroundColorBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.blue));
            }
        });

        //Changes the text to Android is Awesome!
        findViewById(R.id.textBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("Android is Awesome! :D");
            }
        });

        //Resets changes to default values
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reset text color back to black
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                //Reset the background color back to light blue
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.lightBlue));

                //Reset the text back to "Hello from Gary Chang!"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Gary Chang!");
            }
        });

        //Changes the text to what is inputted in the text box
        findViewById(R.id.textStringBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get user input
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString().trim();

                //Changes text
                if (TextUtils.isEmpty(newText))
                {
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Gary Chang!");
                }
                else
                {
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }
            }
        });
    }
}
