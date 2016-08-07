package com.luminous.deceree.memegenerator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText mEtUpper;
    private EditText mEtBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        mEtUpper = (EditText) findViewById(R.id.mEtUpper);
        mEtBottom = (EditText) findViewById(R.id.mEtBottom);


    }

    private void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent intent = new Intent(context, Activity2.class);
                intent.putExtra("upper", mEtUpper.getText().toString());
                intent.putExtra("bottom", mEtBottom.getText().toString());
                startActivity(intent);

            }
        });


    }
}


