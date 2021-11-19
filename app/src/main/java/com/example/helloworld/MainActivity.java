package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap on a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
            }
        });

        // User can tap button to change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the background color of the screen
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightblue));
            }
        });

        // Change text values
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text value
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // Click background color for resetting all the views.

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Requirements:
                // 1) Change the text to "Hello from Sruthika!" - ID: text
                ((TextView) findViewById(R.id.text)).setText("Hello from Sruthika!");
                // 2) Change the color to the original color - ID: text
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
                // 3) Reset the background color - ID: parent
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple));
            }
        });

        // User can change the text in the screen to the text they've entered
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text value
                String enteredText = ((EditText)findViewById(R.id.editText)).getText().toString();
                // If the text string is empty, update to the default string
                if (enteredText.isEmpty()){
                    ((TextView) findViewById(R.id.text)).setText("Enter text to customize!");
                }
                else {
                    ((TextView) findViewById(R.id.text)).setText(enteredText);
                }
            }
        });
    }
}