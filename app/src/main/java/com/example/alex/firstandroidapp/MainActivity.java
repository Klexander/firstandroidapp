package com.example.alex.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listener erzeugen
        MeinClickListener testListener = new MeinClickListener();
        Button btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(testListener);
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(testListener);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(testListener);
    }

    //Ereignislistener
    class MeinClickListener implements View.OnClickListener{
        public void onClick(View v){
            String text = "Fehler";

            if(v == findViewById(R.id.button0)){
               text = "Viele Grüße 1";
            }
            if(v == findViewById(R.id.button1)){
                text = "Viele Grüße 2";
            }
            if(v == findViewById(R.id.button2)){
                text = "Viele Grüße 3";
            }
            Toast einToast = Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT);
            einToast.show();
        }
    }

}
