package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class list_demandeurs extends AppCompatActivity {
    TextView title;
    FloatingActionButton mAddFab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demandeurs);

        title=findViewById(R.id.title);
        title.setText("List of requesters");
        mAddFab = findViewById(R.id.add_fab);
        mAddFab.setOnClickListener(view -> {
            Intent i=new Intent(this,form.class);
            startActivity(i);
        });
        List<Item> items= new ArrayList<>();
        items.add( new Item("+6273890","FULL NAME","HOPITAL WXXXX","06/12/2022 on 6PM","AB+",R.drawable.icon));
        items.add( new Item("+6273890","FULL NAME","HOPITAL YYYYY","08/10/2022 on 9PM","O+",R.drawable.icon));
        items.add( new Item("+4989299","FULL NAME","HOPITAL ZZZZ","14/12/2022 on 10AM","A+",R.drawable.icon));

        RecyclerView recyclerView = findViewById(R.id.recyleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }


}