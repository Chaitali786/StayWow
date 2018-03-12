package com.example.chaitali.staywow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnmens = (Button)this.findViewById(R.id.btnmen);
        btnmens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Mens.class);
                MainActivity.this.startActivity(intent);
            }
        });
        Button btnwomens = (Button)this.findViewById(R.id.btnwomen);
       // assert btnwomens != null;
        //assert btnwomens != null;
        btnwomens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Womens.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    }

