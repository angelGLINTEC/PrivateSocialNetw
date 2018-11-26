package com.glintec.app.privatesocialnetwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etuser, etpass;
    private Button btnSocNet;
    private String user="glintec";
    private String password = "glintec1315";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etuser = findViewById(R.id.edTxt_USER);
        etpass = findViewById(R.id.edTxt_PASSW);
        btnSocNet = findViewById(R.id.btn_ACCESS);


        View.OnClickListener cl = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                checkEntrance();
            }
        };

        btnSocNet.setOnClickListener(cl);

    }

    public void checkEntrance(){
        String StrUsuario = etuser.getText().toString();
        String StrPass = etpass.getText().toString();

        if(StrUsuario.equals(user) && StrPass.equals(password)){
            Toast.makeText(this,"Datos Correctos", Toast.LENGTH_LONG).show();

            Intent i = new Intent(MainActivity.this, SocialNetworkActivity.class);
            startActivity(i);

        }else{
            Toast.makeText(this,"USUARIO O PASSWORD INCORRECTOS", Toast.LENGTH_LONG).show();
        }
    }
}
