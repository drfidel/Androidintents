package com.akiyofidel.intentsteps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ButtonTwoActivity extends AppCompatActivity {

    //this will get the value of key sent fom calling activity
    public static final String MESSAGE_KEY= "buTwoMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_two);

        //link text view with resource xml
        TextView showMessage = (TextView) findViewById(R.id.TvShowbuttwo);

        //varable to store message
        String Message = getIntent().getStringExtra(MESSAGE_KEY);

        //show message in text view
        showMessage.setText(Message);
    }
}
