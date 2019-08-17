package com.akiyofidel.intentsteps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ButtonOneactivity extends AppCompatActivity {

    //this will get the value of key sent fom calling activity
    public static final String MESSAGE_KEY = "buOneMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_oneactivity);

        // link tv with resource xml
        TextView showmessage = (TextView) findViewById(R.id.TvShowbutone);

        //string to store message to be displayed
        String Messagestring = getIntent().getStringExtra(MESSAGE_KEY);

        //show message in textview
        showmessage.setText(Messagestring);
    }
}
