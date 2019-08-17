package com.akiyofidel.intentsteps;

import android.content.Intent;
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

        //link views with xml resource as views
        View buttonOne = findViewById(R.id.buOne);
        View buttonTwo = findViewById(R.id.buTwo);

        //create command listeners to launch activities
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencmBuone();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencmButwo();
            }

        });

    }

    //fucntions to process to start the activities
    private void opencmBuone() {
        Intent oneintent = new Intent(this,ButtonOneactivity.class);
        //attach keyvalue pair and send text to one activity
        String clickedbuone = "Button one clicked";
        oneintent.putExtra(ButtonOneactivity.MESSAGE_KEY,clickedbuone);
        
        startActivity(oneintent);
    }

    private void opencmButwo() {
        Intent twontent = new Intent(this,ButtonTwoActivity.class);


        //attach the keyvalue pair and send text to one activity
        String clickedbuTwo = "Button two clicked";
        twontent.putExtra(ButtonTwoActivity.MESSAGE_KEY, clickedbuTwo);
        startActivity(twontent);
    }

}
