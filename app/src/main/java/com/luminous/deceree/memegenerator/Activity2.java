package com.luminous.deceree.memegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends MainActivity {
    Button button;
    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
       textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();

        String upper = intent.getStringExtra("upper");
        String bottom  = intent.getStringExtra("bottom");

        textView.setText( upper + " " );
        textView2.setText( bottom + " " );


    }


}
