package com.glintec.app.privatesocialnetwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialNetworkActivity extends AppCompatActivity {
    private Button btnRegreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_network);

        btnRegreso= findViewById(R.id.btnRETURN);

        View.OnClickListener cl2 = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();

            }
        };

        btnRegreso.setOnClickListener(cl2);
    }
}
