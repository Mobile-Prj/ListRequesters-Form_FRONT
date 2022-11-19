package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.title);
        title.setText("HOME");
        //FirstName text,LastName text,gender text,Phone text,Address text,email text,BloodCategory text,password text,image text,Isdonor boolea

    }

    public void listDemandeurs(View view) {
        Intent i=new Intent(this,list_demandeurs.class);
        startActivity(i);
    }
}