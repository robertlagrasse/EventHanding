package com.example.android.eventhanding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create button object in java

        Button clicker = (Button) findViewById(R.id.button);

        // creates and sets the onClickListener for the button in Java
        clicker.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v){
                        TextView displayText = (TextView) findViewById(R.id.displayTextView);
                        displayText.setText("Good job!");
                    }
                }
        );

        clicker.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView displayText = (TextView) findViewById(R.id.displayTextView);
                        displayText.setText("It's so long!!");
                        return true;
                    }
                }
        );


    }
}
